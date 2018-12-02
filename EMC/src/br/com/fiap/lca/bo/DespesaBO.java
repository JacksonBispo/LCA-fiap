package br.com.fiap.lca.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.lca.bean.Despesa;
import br.com.fiap.lca.bean.TipoDesp;
import br.com.fiap.lca.dao.DespesaDAO;

public class DespesaBO {

	public List<TipoDesp> listarDespesas(Connection c) throws SQLException {
		DespesaDAO dao = new DespesaDAO();
		return dao.listarDespesas(c);
	}

	public List<Despesa> listarLanDesp(Connection conexao) throws Exception {
		return new DespesaDAO().listaConsulDesp(conexao);
	}

	public void cadastrarDesp(Despesa despesa, Connection c) throws Exception {
		new DespesaDAO().cadastrarDesp(despesa, c);
	}

}
