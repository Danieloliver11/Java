package DadosBancoEXCEPTION;

import java.util.Scanner;

import Entidades.Conta;

public class Main {
	/*
	 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
	 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
	 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
	 * ao limite de saque da conta. Implemente a conta bancária conforme projeto
	 * abaixo:
	 */

	public static void main(String[] args) throws DomainException {

		try {
			Scanner leia = new Scanner(System.in);

			System.out.println("Entre com o numero da conta");
			int numero = leia.nextInt();

			System.out.println("Nome:");
			String nome = leia.next();

			System.out.println("Saldo inicial");
			double saldo = leia.nextDouble();

			System.out.println("Qual é o saque limite");
			double saqueLi = leia.nextDouble();

			System.out.println("Digite seu saque!");
			double saquee = leia.nextDouble();

			Conta conta = new Conta(numero, nome, saldo, saqueLi);

			conta.saque(saquee);

			System.out.println("Seu saldo é : " + conta.getSaldo());

		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

	}

}
