package FileScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		
		
		File file = new File("/Users/danielmacedodeoliveira/teste.txt"); //file é um objeto Filefile.xml 
		Scanner arquivo = null;
		try {
		arquivo = new Scanner(file); 	
		
		while(arquivo.hasNextLine()) { // verifica se ainda tem uma proxima linha no arquivo.
			System.out.println(arquivo.nextLine()); // nextLine le a linha do arquivo
		}
		
		}
		catch(IOException e) {
			System.out.println("[ERRO] "+ e.getMessage() );
			
			
		}
		//boa prartica 
		finally {
			if(arquivo != null) {   // fecha o scanner, mas verifica antes se o arquivo tem conteudo.
				arquivo.close();
			}
		}
		
	}
}
