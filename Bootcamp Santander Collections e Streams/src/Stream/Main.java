package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//  
		
		 
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Anderson");
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Juliana");
		
		System.out.println(nomes.stream().count());// ele vai contar a quantidade de elementos na nossa lista. retorna a contagem de elementos  7

		System.out.println(nomes.stream().min(Comparator.comparingInt(String::length))); // pega a colecao faz uma ordenacao e retorna o menor elemenots pela quantidade de letras
		System.out.println(nomes.stream().max(Comparator.comparingInt(String::length)));// retorna o maior
		
		// filter ele retorna uma nova colecao stream. filter sempre recebera uma regra que retorna TRUE ou FALSE. so entrara na stream nomes que tiverem a letra "a"no nome.
		System.out.println(nomes.stream().filter((nome) -> nome.toLowerCase().contains("a")).collect(Collectors.toList()));// so quem tem a letra "a"no nome usamos o Collectors para converter em List 
	// [Juliana, Carlos, Anderson, Joao, Maria, Juliana]
		
		
		
		System.out.println(nomes.stream().map(nome -> nome.concat("-").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));

	}

}
