/*
	Faça um sistema que leia a idade de uma pessoa expressa em anos,
	meses e dias e mostre-a expressa apenas em dias. 
*/
package aulaUm;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totalEmDias;
		
		System.out.print("Quantidade de dias vividos? ");
		anos = ler.nextInt();
		System.out.print("Informe os meses: ");
		meses = ler.nextInt();
		System.out.print("Informe os dias: ");
		dias = ler.nextInt();
		totalEmDias = (anos * 365) + (meses * 30) + (dias);
		
		System.out.printf("O total da sua idade em dias é de %d", totalEmDias);
		
	}

}

