package br.com.fiap.lca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.lca.bean.Honorario;
import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.bean.TipoTarefa;
import br.com.fiap.lca.conexao.ConexaoFactory;

public class HonorarioDAO {
	private Connection conn;

	public HonorarioDAO() {
		this.conn = new ConexaoFactory().getConnection();
	}

	public List<Honorario> listaConsulHono(Connection c) throws SQLException {
		List<Honorario> listaTipoHonorario = new ArrayList<Honorario>();
		String sql = "SELECT * FROM T_AM_FIS_LANCA_HONORARIO LH INNER JOIN T_AM_FIS_PROCESSO P ON(LH.NR_PROCESSO = P.NR_PROCESSO) INNER JOIN T_AM_FIS_TIPO_TAREFA TF ON(TF.CD_TIPO_TAREFA = LH.CD_TIPO_TAREFA)";
		PreparedStatement estrutura = conn.prepareStatement(sql);
		ResultSet dados = estrutura.executeQuery();
		while(dados.next()){
			Honorario hono 	 = new Honorario();
			Processo proc 	 = new Processo();
			TipoTarefa tpTaf = new TipoTarefa();
			hono.setCdLanca(dados.getInt("CD_LANCAMENTO"));
			tpTaf.setCdTpTarefa(dados.getInt("CD_TIPO_TAREFA"));
			hono.setTipoTarefa(tpTaf);
			proc.setNumProc(dados.getInt("NR_PROCESSO"));
			hono.setProcesso(proc);
			hono.
			DT_HONORARIO
			QT_HORA
			DS_OBSERVACAO
			
			
			
		}
		return listaTipoHonorario;
	}

}
