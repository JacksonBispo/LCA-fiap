package br.com.fiap.lca.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.lca.bean.Despesa;
import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.bean.TipoDesp;
import br.com.fiap.lca.conexao.ConexaoFactory;

public class DespesaDAO {

	private Connection conn;

	public DespesaDAO() {
		this.conn = new ConexaoFactory().getConnection();
	}

	public List<TipoDesp> listarDespesas(Connection c) throws SQLException {
		List<TipoDesp> listaTipoDespesa = new ArrayList<TipoDesp>();
		PreparedStatement estruturaDesp = conn
				.prepareStatement("SELECT CD_TIPO_DESPESA, DS_TIPO_DESPESA FROM T_AM_FIS_TIPO_DESPESA");
		ResultSet resultadoDados = estruturaDesp.executeQuery();
		while (resultadoDados.next()) {
			TipoDesp td = new TipoDesp();
			td.setCodTpDesp(resultadoDados.getInt("CD_TIPO_DESPESA"));
			td.setStrTpDesp(resultadoDados.getString("DS_TIPO_DESPESA"));
			listaTipoDespesa.add(td);
		}
		return listaTipoDespesa;
	}

	public void cadastrarDesp(Despesa despesa, Connection conexao) {
		String sql = "INSERT INTO T_AM_FIS_LANCA_DESPESA VALUES ("
				+ "SQ_AM_FIS_LANCA_DESPESA.NEXTVAL, ?, ?,?,?,?)";
		try {
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setInt(1, despesa.getTipoDesp().getCodTpDesp());
			estrutura.setInt(2, despesa.getCodProc());
			estrutura.setDate(3, null);
			estrutura.setDouble(4, despesa.getVlDesp());
			estrutura.setString(5, despesa.getObsDesp());
			estrutura.execute();
			estrutura.close();
		} catch (SQLException e) {
			throw new RuntimeException("Despesa já cadastrada!");
		}
	}

	public List<Despesa> listaConsulDesp(Connection conexao)
			throws SQLException {
		List<Despesa> listaDesp = new ArrayList<Despesa>();
		String sql = "SELECT* FROM T_AM_FIS_LANCA_DESPESA  LD INNER JOIN T_AM_FIS_PROCESSO P ON(LD.NR_PROCESSO = P.NR_PROCESSO) INNER JOIN T_AM_FIS_TIPO_DESPESA TD ON(LD.CD_TIPO_DESPESA = TD.CD_TIPO_DESPESA)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		ResultSet dados = estrutura.executeQuery();
		while (dados.next()) {
			Despesa lan   = new Despesa();
			Processo proc = new Processo();
			TipoDesp tp   = new TipoDesp();
			lan.setCodLanD(dados.getInt("CD_LANCAMENTO"));
			tp.setStrTpDesp(dados.getString("DS_TIPO_DESPESA"));
			lan.setTipoDesp(tp);
			proc.setProcesso(dados.getString("DS_PROCESSO"));
			proc.setNumProc(dados.getInt("NR_PROCESSO"));
			lan.setProcesso(proc);
			Calendar dt = Calendar.getInstance();
			dt.setTime(dados.getDate("DT_DESPESA"));
			lan.setDtDesp(dt);
			lan.setVlDesp(dados.getDouble("VL_DESPESA"));
			lan.setObsDesp(dados.getString("DS_OBSERVACAO"));
			listaDesp.add(lan);
		}
		estrutura.close();
		return listaDesp;
	}

}
