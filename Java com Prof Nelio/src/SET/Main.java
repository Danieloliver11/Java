package SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	

	public static void main(String[] args) {
		/*
		 * Set<T> " interface " 
• Representa um conjunto de elementos (similar ao da Álgebra) • Não admite repetições
• Elementos não possuem posição
• Acesso, inserção e remoção de elementos são rápidos
• Oferece operações eficientes de conjunto: interseção, união, diferença.
• Principais implementações:
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados*/
		
		
		// Alguns métodos importantes
		
		/*• add(obj), remove(obj), contains(obj)
• BaseadoemequalsehashCode
• Se equals e hashCode não existir, é usada comparação de ponteiros
• clear()
• size()
• removeIf(predicate)
• addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição • retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
• removeAll(other) - diferença: remove do conjunto os elementos contidos em other*/
		
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook")); // true
		
	//  remove todo elemento x tal que o x.length >= 3. x -> x é  um predicado
			set.removeIf(x -> x.length() >= 3);  // vai deixar apenas a Tv
			
		for (String p : set) { 
			System.out.println(p);
		}
		
		 
		/* print:
		 
		true
		TV
		Notebook
		Tablet */
		System.out.println("======================================");
		
		
		Set<String> setTree = new TreeSet<>(); // ele ordena os dados tambem
		setTree.add("Tv");
		setTree.add("Tablet");
		setTree.add("Notebook");
		
		System.out.println(setTree.contains("Notebook")); // true
		
		setTree.removeIf(x -> x.charAt(0) == 'T'); // VAI REMOVER todos que tiverem a primeira letra 'T' Tablet e Tv.
		
		for (String p : setTree) { 
			System.out.println(p);
		
		}
		/* print:
		true
	Notebook
	Tablet
	Tv */
		
		System.out.println("======================================");
		
		
		Set<String> linked = new LinkedHashSet<>(); // mantem a ordem que os dados sao inseridos 
		linked.add("Tv");
		linked.add("Tablet");
		linked.add("Notebook");
		
		System.out.println(linked.contains("Notebook")); // true
		
		for (String p : linked) { System.out.println(p);
		}
		
	}
	
	/* print:
		true
	Tv
	Tablet
	Notebook  */
	
	
	
	
	
	

}
