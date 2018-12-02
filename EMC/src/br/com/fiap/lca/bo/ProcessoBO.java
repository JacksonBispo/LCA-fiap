package br.com.fiap.lca.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.dao.ProcessoDAO;




public class ProcessoBO {
	public List<Processo> listarProc(Connection conexao) throws Exception {
		return new ProcessoDAO().getLista();
	}	
	
	public List<Processo> buscarPorNumero(int numero, Connection c) throws Exception {
		return new ProcessoDAO().buscarPorNumero(numero, c);
	}
}