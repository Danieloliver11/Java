package PessoaFisicaEjuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
