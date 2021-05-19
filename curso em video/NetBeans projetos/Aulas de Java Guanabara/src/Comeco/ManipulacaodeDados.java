package Comeco;

import java.util.Scanner;

public class ManipulacaodeDados {
	public static void main(String[] args) {

	float nota = 8.6f; 
	String nome = "Daniel";
	
	System.out.println(nota);
	System.out.printf("a nota é %f \n",nota);
	System.out.printf("a nota de %s é %.2f",nome,nota);
	System.out.format("a notaaaa de %s é %.2f \n",nome,nota);
	
	Scanner leia = new Scanner(System.in);
	
	System.out.format("Qual seu nome?\n");
	nome =leia.next();
	System.out.format(nome);

	//convertendo inteiro em string
	int idade = 30;
	String valor = Integer.toString(idade);
	System.out.format(valor);

	String val = "30";
	int trinta = Integer.parseInt(val);
	

	String valoor = "30";
	float trintaa = Integer.parseInt(valoor);
	
	
		}
}
