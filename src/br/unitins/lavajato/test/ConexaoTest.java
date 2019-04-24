package br.unitins.lavajato.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoTest {

	public static void main(String[] args) {
		// Registrando o driver do postgres
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/lavajato", "topicos1", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn == null) {
			System.out.println("Conexao Falhou");
			return;
		} else {
			System.out.println("Conexao  realizada com sucesso!");
		}
		try {
			Statement stat = conn.createStatement();
			stat.execute("INSERT INTO carro(placa, categoria, modelo, marca)" + "VALUES( 'KGB-1223',1,'GOL',1)");

			conn.close();
			System.out.println("Insersao realizada com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
