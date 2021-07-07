package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 
		
		List<Estudante> estudante = new ArrayList<>();
		
		estudante.add(new Estudante("Pedro",19));
		estudante.add(new Estudante("Carlos",23));
		estudante.add(new Estudante("Maria",21));
		estudante.add(new Estudante("Joaõ",18));
		estudante.add(new Estudante("George",22));
		estudante.add(new Estudante("Larissa",21));
		// quero ordenar por idade
		System.out.println("=======");
		System.out.println(estudante);
		
		System.out.println("ordem natural dos numeros - idade ");

		// ordem natural dos numeros - idade 
		estudante.sort((entrada, segundaentrada)-> entrada.getIdade() - segundaentrada.getIdade());// lambda expressao funcional. compare com numeros inteiros usando o getIdade
		System.out.println(estudante);
		
		System.out.println("ordem reversa");
		
		estudante.sort((entrada, segundaentrada)-> segundaentrada.getIdade() - entrada.getIdade());
		
		System.out.println(estudante);
		
		System.out.println("ordem natural dos numeros - idade (method reference)");
		
		estudante.sort((Comparator.comparingInt(Estudante::getIdade))); // compare com numeros inteiros usando o getIdade
		System.out.println(estudante);

		
		System.out.println("ordem reversa dos numeros - idade (method reference)");
		
		estudante.sort((Comparator.comparingInt(Estudante::getIdade).reversed()));
		System.out.println(estudante);

		System.out.println("ordem natural dos numeros - idade (Interface Comparator)");
		
		Collections.sort(estudante);
		System.out.println(estudante);
		
		System.out.println("ordem reversa dos numeros - idade (Interface Comparator)");
		
		Collections.sort(estudante, new EstudanteOrdemIdadeInversa());
		
		System.out.println(estudante);
		
		/*=======
		[Pedro - 19 , Carlos - 23 , Maria - 21 , Joaõ - 18 , George - 22 , Larissa - 21 ]
		ordem natural dos numeros - idade 
		[Joaõ - 18 , Pedro - 19 , Maria - 21 , Larissa - 21 , George - 22 , Carlos - 23 ]
		ordem reversa
		[Carlos - 23 , George - 22 , Maria - 21 , Larissa - 21 , Pedro - 19 , Joaõ - 18 ]
		ordem natural dos numeros - idade (method reference)
		[Joaõ - 18 , Pedro - 19 , Maria - 21 , Larissa - 21 , George - 22 , Carlos - 23 ]
		ordem reversa dos numeros - idade (method reference)
		[Carlos - 23 , George - 22 , Maria - 21 , Larissa - 21 , Pedro - 19 , Joaõ - 18 ]
		ordem natural dos numeros - idade (Interface Comparator)
		[Joaõ - 18 , Pedro - 19 , Maria - 21 , Larissa - 21 , George - 22 , Carlos - 23 ]
		ordem reversa dos numeros - idade (Interface Comparator)
		[Carlos - 23 , George - 22 , Maria - 21 , Larissa - 21 , Pedro - 19 , Joaõ - 18 ]
		*/
		


		
		

	}
	

}
