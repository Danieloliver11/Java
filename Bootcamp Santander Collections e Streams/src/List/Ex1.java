package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Ex1 {
	public static void main (String[] args) {
		
	 
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Anderson");
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Juliana");

		
		System.out.println(nomes);
		
		Collections.sort(nomes); // api padrao do java collectoions, sort deixa em ordem
		
		System.out.println(nomes);
		
		nomes.set(2, "Joaozinho"); // atualiza pela posicao e o novo valor pelo segundo parametro.

		System.out.println(nomes);
		
		nomes.remove(3); // remove o elemento pelo índice 
		
		System.out.println(nomes);
		
		nomes.remove("Carlos"); //remove que apaga um objeto
		
		System.out.println(nomes);
		
		String nome = nomes.get(0); // pega pela possicao e joga em uma variavel
		
		System.out.println(nome); // Anderson
		
		int tamanho = nomes.size(); // retorna o numero inteiro com a quantidade de elementos na lista.
		
		System.out.println(tamanho);
		
		boolean temMaria =  nomes.contains("Maria");// retorna um bool se um elemento estiver na lista.
		
		System.out.println(temMaria); // true
		
		boolean estaVazia = nomes.isEmpty(); // recebe um bool, nao recebe parametro. 
		
		System.out.println(estaVazia); // false, nossa lista nao esta vazia.
		
		int posicao = nomes.indexOf("Pedro"); // verifica se o nome esta na lista e retorna a posicao dele.
		
		System.out.println(posicao); //4  se nao encontrar o índice na lista, retorna -1.
		
		Iterator<String> interator =  nomes.iterator();
		
		while(interator.hasNext()) {
			System.out.println("-----> "+interator.next());
		}

		
		
		// foreach
		//declaracao da variavel e o seu tipo.
		//segundo argomento é a lista
		for(String x: nomes) {
			System.out.println(x);
		
		}



		
	}

}
