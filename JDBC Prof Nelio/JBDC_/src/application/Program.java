package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// testando conexao
		
		
		Connection conn = DB.getConnetion(); // ABRE CONEXAO
		
		DB.closeConnection();// FECHA CONEXAO

	}

}
