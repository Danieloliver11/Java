package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//  Nao garante a ordem, a implementacoes que pode ordenar". 
		// Nao permite itens repetidos.
		// permite adicao e remocao normalmente. nao tem busca por item. permite navegacao 
		// nao permite mudanca de ordenacao.
		
		
		Set<Double>notaAluno = new HashSet<>();
		
		notaAluno.add(5.8);
		notaAluno.add(6.8);
		notaAluno.add(10.0);
		notaAluno.add(4.0);
		notaAluno.add(3.8);
		notaAluno.add(9.3);
		System.out.println(notaAluno);
		// [4.0, 5.8, 10.0, 6.8, 3.8, 9.3]

		
		notaAluno.remove(10.0);
		System.out.println(notaAluno);
		// [4.0, 5.8, 6.8, 3.8, 9.3]
		
		notaAluno.size();

		

		notaAluno.isEmpty();
		
		System.out.println("========LinkedHashSet=======");

		
		Set<Double> notaAluno2 = new LinkedHashSet<>();
		
		notaAluno2.add(5.8);
		notaAluno2.add(6.8);
		notaAluno2.add(10.0);
		notaAluno2.add(4.0);
		notaAluno2.add(3.8);
		notaAluno2.add(9.3);
		System.out.println(notaAluno2);
		//[5.8, 6.8, 10.0, 4.0, 3.8, 9.3] ordem natural dos elementos 
		
		notaAluno2.remove(10.0);
		
		notaAluno2.size();
		
		notaAluno2.isEmpty();


		System.out.println("========TreeSet=======");


		TreeSet<Double>notaAluno3 = new TreeSet<>(); // arvore binaria ordem de arvore, nos e nos filhos 
		
		notaAluno3.add(5.8);
		notaAluno3.add(6.8);
		notaAluno3.add(10.0);
		notaAluno3.add(4.0);
		notaAluno3.add(3.0);
		notaAluno3.add(9.3);
		
		System.out.println(notaAluno3.first());// da o primeiro elemento que esta no topo da nossa arvore
		System.out.println(notaAluno3.last());// ultimo elemento da arvore
		System.out.println(notaAluno3.lower(4.0));// da o elemento que esta a baixo do 4.0
		System.out.println(notaAluno3.higher(4.0));// a cima 
		
	}

}
