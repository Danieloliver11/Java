package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	/*
	 * o projeto tem que ter uma piblioteca de conexao com o mysql. baixar :
	 * https://dev.mysql.com/downloads/connector/j/
	 * 
	 * baaixe da plataforma idependente segundo arquivo zip.
	 */

	public static void main(String[] args) throws SQLException {

		Connection conexao = null;
		Statement statement = null; // consulta sql de todos os departamentos do banco de dados
		ResultSet resultSet = null; // o resultado dessa consulta sera guardada aqui.

		// como vamos acessas um ambiente externo que pode gerar exceções, colocamos um
		// try

		try {
			conexao = DB.getConnetion(); // conecta com o banco de dados.

			statement = conexao.createStatement(); // com a variavel statement(comando sql) dessa madeira esta
													// instanciada com uma conexao o statement.

			// resultSet recebe essa query
			resultSet = statement.executeQuery("select * from department"); // essa funcao de Statement, espera uma
																			// String no parametro que é UM COMANDO SQL!
			// precisamos pergorrer entao essa tabela para poder aparecer as informacoes.
			// já que ele comeca na posicao 0 antes de ter os dados. entao para percorrer os dados usamos o next();
			// ele percorre as posicoes e quando termina RETORNA FALSE SE JÁ ESTIVER NO ULTIMO!
			
			// O meu objeto resultSet tem uma forma de uma tabela.
			
			
			while(resultSet.next()) {
				// como faz para acessar o primeiro campo da coluna ID  da minha tabela  ?
				// se escreve assim dentro do print com o metodo getInt porque o ID É UM NUMERO INTEIRO. E dentro do parametro colocamos o nome do campo do id, que é Id
				//depois vamos pegar a COLUNA DO NOME da tabela department com getString já que os valores sáo Strings.
				System.out.println(resultSet.getInt("Id") + ", "+ resultSet.getString("Name"));
			}
			/*
			 * resultado 
			 * 1, Computers
			2, Electronics
			3, Fashion
			4, Books*/
			
		} catch (SQLException e) {
			e.printStackTrace();
			// importante dar um close nas conexoes!
		}finally {
			resultSet.close();
			statement.close();
			DB.closeConnection();
			
		}

	}

}
