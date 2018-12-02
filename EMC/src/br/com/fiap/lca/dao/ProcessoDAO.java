package br.com.fiap.lca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.lca.bean.Advogado;
import br.com.fiap.lca.bean.Causa;
import br.com.fiap.lca.bean.Cliente;
import br.com.fiap.lca.bean.Forum;
import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.conexao.ConexaoFactory;

public class ProcessoDAO {
private Connection conexao;
	
	public ProcessoDAO() {
		this.conexao = new ConexaoFactory().getConnection();
	}

	public List<Processo> getLista() throws SQLException{	
		List <Processo> listaProcesso = new ArrayList<Processo>();
		PreparedStatement estruturaProcesso = conexao.prepareStatement("SELECT * FROM T_AM_FIS_PROCESSO PR INNER JOIN T_AM_FIS_CLIENTE CL ON(PR.CD_CLIENTE = CL.CD_CLIENTE)");
		ResultSet resultadoDados = estruturaProcesso.executeQuery();			
			
			Advogado adv = new Advogado();			
			Forum forum = new Forum();
			Causa causa = new Causa();
			
			while(resultadoDados.next()) {
				Processo c = new Processo();
				Cliente cli = new Cliente();
				c.setNumProc(resultadoDados.getInt("NR_PROCESSO"));
				c.setProcesso(resultadoDados.getString("DS_PROCESSO"));
					cli.setRazao(resultadoDados.getString("DS_RAZAO_SOCIAL"));
					c.setCliente(cli);
				listaProcesso.add(c);
			}				
				resultadoDados.close();
				estruturaProcesso.close();							
			return listaProcesso;		
	}
	
     public List<Processo> buscarPorNumero(int numero, Connection conexao){
    	 
    	 String sql = "SELECT * FROM T_AM_FIS_PROCESSO PR INNER JOIN T_AM_FIS_CLIENTE CL ON (PR.CD_CLIENTE = CL.CD_CLIENTE) WHERE NR_PROCESSO = ?";    		
            try {
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setInt(1, numero);
			ResultSet resultadoDados = estrutura.executeQuery();
			List<Processo>lista=new ArrayList<Processo>();					
			while(resultadoDados.next()) { 
				Processo c = new Processo();
				Cliente cli = new Cliente();				
        		c.setNumProc(resultadoDados.getInt("NR_PROCESSO"));
        		c.setProcesso(resultadoDados.getString("DS_PROCESSO"));
        		cli.setRazao(resultadoDados.getString("DS_RAZAO_SOCIAL"));
        		c.setCliente(cli);        	
        		lista.add(c);
			}				
			resultadoDados.close();
			return lista ;			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    	 
     }
     
}
