package br.com.fiap.lca.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.lca.bean.Despesa;
import br.com.fiap.lca.conexao.ConexaoFactory;
import br.com.fiap.lca.dao.DespesaDAO;

public class testeLista {

	public static void main(String[] args) {
		try{
			
			DespesaDAO dao=new DespesaDAO();
			Connection c = ConexaoFactory.getConnection();
			List <Despesa> lst=dao.listaConsulDesp(c);
			for(Despesa lan :lst){
				System.out.println("------------------------------------------");
				System.out.println(("Codigo lançamento: "+ lan.getCodLanD()));
				System.out.println("Tipo despesa: "+lan.getTipoDesp().getStrTpDesp());
				System.out.println("Numero do processo: " +lan.getProcesso().getNumProc());
				System.out.println("Descrição do processo: "+lan.getProcesso().getProcesso());
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("data Ulyi: "+sdf.format(lan.getDtDesp().getTime()));
				System.out.println("Valor despesa: "+lan.getVlDesp());
				System.out.println("Obervação: "+lan.getObsDesp());
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
