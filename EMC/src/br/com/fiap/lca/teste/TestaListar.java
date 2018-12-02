package br.com.fiap.lca.teste;


import java.sql.SQLException;
import java.util.List;

import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.dao.ProcessoDAO;

public class TestaListar {

	public static void main(String[] args){
		try {
		ProcessoDAO dao = new ProcessoDAO();
		List <Processo> lstProcesso = dao.getLista();
		for (Processo processo : lstProcesso){
			System.out.println("cod "+ processo.getNumProc());
			System.out.println("desc "+ processo.getProcesso());
			System.out.println("cli "+processo.getCliente().getRazao());
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
