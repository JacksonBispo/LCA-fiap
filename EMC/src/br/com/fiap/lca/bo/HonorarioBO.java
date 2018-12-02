package br.com.fiap.lca.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.lca.bean.Honorario;
import br.com.fiap.lca.dao.HonorarioDAO;

// REGRAS DE NEGOCIO AQUI
public class HonorarioBO {

	// faz a listagem dos honorarios
	public List<Honorario> listarLanHono(Connection c) throws SQLException{
		return new HonorarioDAO().listaConsulHono(c);
	}

}
