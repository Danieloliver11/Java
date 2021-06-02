package exercicios.ex04;

import java.util.Scanner;

public class MainCotacao {
	public static void main (String[]  args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Coloque a quantidade de dolar para sacar !");
		//double reais = leia.nextDouble();
		Cotacao s = new Cotacao();
		s.setReais(200.00);
		System.out.println("o total em reais que vc tem que pagar com IOF DE 6% é ");
		System.out.println(Cotacao.cotacao());
		
		
	}

}
