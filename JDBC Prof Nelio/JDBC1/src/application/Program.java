package application;

import java.sql.Connection;

import db.DB;

public class Program {
	/*o projeto tem que ter uma piblioteca de conexao com o mysql. 
	 * baixar : https://dev.mysql.com/downloads/connector/j/
	 * 
	 * baaixe da plataforma idependente segundo arquivo zip. 
	 * 
	 * Caso ainda não exista, criar uma User Library contendo o arquivo .jar do driver do MySQL
o Window -> Preferences -> Java -> Build path -> User Libraries o Dê o nome da User Library de MySQLConnector
o Add external JARs -> (localize o arquivo jar)
 Criar um novo Java Project
OU Se já tem um projeto add a librarie Build path  clicando com o direito na pasta principal do projeto.

	 */

	public static void main(String[] args)  {
		// testando conexao
		
		
		Connection conn = DB.getConnetion(); // ABRE CONEXAO
		
		DB.closeConnection();// FECHA CONEXAO

	}

}
