package br.com.fiap.lca.teste;

import java.sql.Connection;

import br.com.fiap.lca.conexao.ConexaoFactory;


public class TesteConexao {
	public static void main(String[] args) {
		Connection c = null;
		try {
			new ConexaoFactory();
			c = ConexaoFactory.getConnection();
			System.out.println("Conexão aberta!");
			c.close();
		} catch(Exception e) {
			ConexaoFactory.fechar(c);
			System.out.println("Erro de conexao!" + e);
		}
	}

}