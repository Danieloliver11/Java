package interface_funcional_Function_com_map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		
//Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta.
		
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		System.out.println("• Implementação da interface");
		
		//Quando usamos o stream e queremos jogar um valor em uma lista, temos que trasformar essa stream em lista com o collect(Collectors.toList())
		
		// O map APLICA UMA FUNCAO PARA CADA ELEMENTO DESSA LISTA. Gerando para mim uma NOVA Stream com OS ELEMENTOS TRASFORMADOS!
		
		// map funciona com stream. 	

		List<String> nome = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		nome.forEach(System.out::println);
		
		System.out.println("• Reference method com método estático ----------------------");
		
		List<String> nome2 = list.stream().map(Product::nomeStatico).collect(Collectors.toList());

		nome2.forEach(System.out::println);

		
		System.out.println("• Reference method com método não estático ----------------------");
		
		List<String> nome3 = list.stream().map(Product::nonStaticoNome).collect(Collectors.toList());
		nome3.forEach(System.out::println);
		
		System.out.println("• Expressão lambda declarada ----------------------");
		
		Function<Product, String> func = x -> x.getNome().toUpperCase();
		
		List<String> nome4 = list.stream().map(func).collect(Collectors.toList());
		
		nome4.forEach(System.out::println);
		
		
		
		System.out.println(" • Expressão lambda inline ----------------------");
		
		List<String> nome5 = list.stream() .map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nome5.forEach(System.out::println);


		
	}

}
