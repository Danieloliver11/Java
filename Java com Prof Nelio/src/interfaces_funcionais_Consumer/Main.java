package interfaces_funcionais_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * Por exemplo, Consumer<T> contém uma função que recebe um argumento e tem um retorno void, enquanto Predicate<T> 
 * é uma interface com uma função que recebe um argumento e retorna um boolean, que geralmente é usado para escrever lambdas de f
 * iltragem.
 * 
 * https://imasters.com.br/back-end/metodos-padrao-os-herois-nao-divulgados-do-java-8 
 * 
 * 
 * 
 * 
 * 
 * 
 * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.
 * 
 * */

public class Main {

	public static void main(String[] args) {

		System.out.println("• Implementação da interface");

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(new PriceUpDate()); // percorre a lista aplicando o consumer PriceUpDate a cada elemento da lista.

		list.forEach(System.out::println);

		/*
		 * Productoo [nome=Tv, preco=990,00] Productoo [nome=Mouse, preco=55,00]
		 * Productoo [nome=Tablet, preco=385,55] Productoo [nome=HD Case, preco=88,99]
		 */

		System.out.println("• Reference method com método estático ----------------------");

		list.forEach(Product::staticPrice);
		list.forEach(System.out::println);

		System.out.println("• Reference method com método não estático ----------------------");

		list.forEach(Product::nonStaticPrice);
		list.forEach(System.out::println);

		System.out.println("• Expressão lambda declarada ----------------------");

		Consumer<Product> produto = p -> p.setPreco(p.getPreco() * 1.1); // como tem apenas uma linha minha funcao, as
																			// chaves sao opcionais!

		list.forEach(produto);
		list.forEach(System.out::println);

		System.out.println(" • Expressão lambda inline ----------------------");

		list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		list.forEach(System.out::println);
	}

}
