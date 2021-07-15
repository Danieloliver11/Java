package interfaces_funcionais_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Predicatee {

	public static void main(String[] args) {
		//
		
		List<Productoo> list = new ArrayList<>();
		
		list.add(new Productoo("Tv", 900.00));
		list.add(new Productoo("Mouse", 50.00));//
		list.add(new Productoo("Tablet", 350.50));
		list.add(new Productoo("HD Case", 80.90 ));//
		
		list.removeIf( new ProductooPredicate());	
		
		for(Productoo x: list) {
			System.out.println(x);
			
			//  Productoo [nome=Mouse, preco=50.0]
			//  Productoo [nome=HD Case, preco=80.9]
		}
		
		//• Reference method com método estático
		
		list.add(new Productoo("Tablet", 350.50));
		list.add(new Productoo("Tv", 900.00));


		
		list.removeIf(Productoo::staticProductPredicate); // referência para metodo
		for(Productoo x: list) {
			System.out.println(x);
			
			//  Productoo [nome=Mouse, preco=50.0]
			//  Productoo [nome=HD Case, preco=80.9]
		}

		
		 System.out.println(" Reference method com método não estático");
		
		list.add(new Productoo("Tablet", 350.50));
		list.add(new Productoo("Tv", 900.00));


		
		list.removeIf(Productoo::nonStaticProductPredicate); // referência para metodo
		for(Productoo x: list) {
			System.out.println(x);
			
			//  Productoo [nome=Mouse, preco=50.0]
			//  Productoo [nome=HD Case, preco=80.9]
		}
		
		
		System.out.println(" • Expressão lambda declarada");
		//• Expressão lambda declarada
		
		list.add(new Productoo("Tablet", 350.50));
		list.add(new Productoo("Tv", 900.00));
		
		double min = 100.0;

		Predicate<Productoo> produto = p -> p.getPreco() >= min;
		
		list.removeIf(produto);
		
		
			
		for(Productoo x: list) {
			System.out.println(x);
			
			//  Productoo [nome=Mouse, preco=50.0]
			//  Productoo [nome=HD Case, preco=80.9]
		}
		
		System.out.println(" • Expressão lambda inline");
		
		list.removeIf(p -> p.getPreco() >=min); //  remove os precos maior que 100 
		
		for(Productoo x: list) {
			System.out.println(x);
			// Productoo [nome=Mouse, preco=50.0]
			// Productoo [nome=HD Case, preco=80.9]
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
