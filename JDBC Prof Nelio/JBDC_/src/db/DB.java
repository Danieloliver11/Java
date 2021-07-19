package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	// java.sql
	private static Connection conexao = null;
	// abre a conexao com o banco

	public static Connection getConnetion() {
		if (conexao == null) {
			try {
				Properties properties = loadProperties(); // pega as propiedades

				String url = properties.getProperty("dburl"); // pega a url

				conexao = DriverManager.getConnection(url, properties); // salva o objeto no conexao com a classe
																		// DriverManager passando a url e as propiedades
																		// do banco
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}

		}

		return conexao;
	}

	// pega os dados do db.properties. metodo para carregar as propiedades
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	// fecha a nexao com o banco de dados

	public static void closeConnection() {

		if (conexao != null) {
			try {
				conexao.close();

			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}

		}

	}

}
