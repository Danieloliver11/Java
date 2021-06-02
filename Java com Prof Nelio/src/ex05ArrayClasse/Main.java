package ex05ArrayClasse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		
		n =leia.nextInt();
		double resul=0;
		
		Produtos[] listaProdutos = new Produtos[n];
		
		for(int i = 0 ; i< listaProdutos.length; i++) {
		System.out.println("Digite o nome do produto");
		leia.nextLine();
		String nome = leia.nextLine();
		System.out.println("Digite o preço do produto");
		double preco = leia.nextDouble();
		
		listaProdutos[i] = new Produtos(nome,preco);
		
		double sun = listaProdutos[i].getPreco();
		double media = listaProdutos.length;
		resul += sun / media;
		
		}
		System.out.println(resul);
		
	}

}
