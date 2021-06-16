package TryCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/*
 * • É um bloco que contém código a ser executado independentemente de ter
ocorrido ou não uma exceção.
• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
recurso específico ao final do processamento.
*/
public class Finally {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(file);
		while (sc.hasNextLine()) {									 // percorre todas as linhas do arquivo se tiver.
		System.out.println(sc.nextLine());
		}
		}
		catch (IOException e) {
		System.out.println("Error opening file: " + e.getMessage());
		}
		finally { 													// fecha o scanner para evitar que o arquivo fique aberto!
		if (sc != null) {
		sc.close();
		
		}
		}
		}
}
