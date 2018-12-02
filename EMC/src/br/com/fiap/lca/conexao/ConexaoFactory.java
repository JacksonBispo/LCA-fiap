package br.com.fiap.lca.conexao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static  Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Servidor em manutenção");
		}
	}
	
	public static void fechar(Connection c) {
		try {
			c.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
