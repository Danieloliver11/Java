package ExUrnaComMAP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos 
 * (formato .csv) que ele obteve em uma urna de votação. Você deve fazer um programa para ler os registros de votação a partir de um 
 * arquivo, e daí gerar um relatório consolidado com os totais de cada candidato.
 * 
 * 
Input file example:
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31

Execution:
Enter file full path: c:\temp\in.txt Alex Blue: 76
Maria Green: 71
Bob Brown: 61

*/
public class Main {

	public static void main(String[] args) {

		String file = "/Users/danielmacedodeoliveira/votacao.txt";

		Map<String, Integer> urna = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String linhas = br.readLine();

			while (linhas != null) {

				String[] parametros = linhas.split(",");
				String nome = parametros[0];
				int votos = Integer.parseInt(parametros[1]);

				if (urna.containsKey(nome)) {

					int novoVoto = urna.get(nome); // pega o valor pela key 
					urna.put(nome, votos + novoVoto);

				} else {
					urna.put(nome, votos);
				}

				linhas = br.readLine();
			}

			for (String x : urna.keySet()) {
				System.out.println(x + ", " + urna.get(x));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
