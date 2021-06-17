package FileResderBufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

/*
• FileWriter (stream de escrita de caracteres em de arquivos)
• https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html

• Cria/recria o arquivo: new FileWriter(path)
• Acrescenta ao arquivo existente: new FileWriter(path, true)
• BufferedWriter (mais rápido)
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html

*/

public class BufferedWriter {


}

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "/Users/danielmacedodeoliveira/teste2.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(path))) {
			
			for (String line : lines) {
				
				bw.write(line);
				
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
