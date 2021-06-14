package PessoaFisicaEjuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, 
e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. 
As regras para cálculo de imposto são as seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. 
Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00*/

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		List<Conta> lista = new ArrayList<>();
		
		System.out.println("Entre com o numero de pagadores");
		int n = leia.nextInt();
		
		for(int x=0; x< n ; x++) {
			
			System.out.println("Digite o tipo de sua conta Conta Pessoa Fisica ou Pessoa Juridia? (F/J)");
			char c = leia.next().toUpperCase().charAt(0);
			
			if(c =='F') {
				
				System.out.println("Nome:");
				String nome =leia.next();
				
				System.out.println("Renda anual:");
				double renda = leia.nextDouble();
				
				System.out.println("Você teve gastos com saude? (S/N)");
				char s = leia.next().toUpperCase().charAt(0);
				
				if(s == 'S') {
					System.out.println("Quantos vc gastou com saude nesse ano?");
					double saude = leia.nextDouble();
					
					Conta Pfisica = new PessoaFisica(nome, renda, saude);
					lista.add(Pfisica);
			}else if(s == 'N') {
				Conta Pfisica = new PessoaFisica(nome, renda, 0.0);
				lista.add(Pfisica);
				}else {
					System.out.println("[ERRO] Com gasto de saude!");
				}
			
		}else if(c == 'J') {
			
			System.out.println("Nome:");
			String nome =leia.next();
			
			System.out.println("Renda anual:");
			double renda = leia.nextDouble();
			
			System.out.println("Quantidade de empregados.");
			int empregado = leia.nextInt();
			
			Conta juridica = new PessoaJuridica(nome, renda, empregado);
			lista.add(juridica);
			
		}
		
		
	}
		double sun=0.0;
		
	System.out.println("TAXES PAID:");
	
	for(Conta y: lista) {
		
		System.out.println(y.toStrings());
		
		 sun = y.imposto(); 
		
	}
	System.out.println("TOTAL TAXES: "+ String.format("%.2f", sun));
	System.out.println();
	

}
}
