package ex06Pensionato;

import java.util.Scanner;

/*
 A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo. */

public class Main {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int room = 0;
		
		System.out.println("Olá, temos 10 quartos. Quantos quartos será reservados para os alunos?");
		int res = leia.nextInt();
		
		Pensionato[] listaAlunos = new Pensionato[10];
		
		for(int i =0; i < res; i++) {
			leia.nextLine();
			System.out.println("Digite o nome para reserva.");
			String nome = leia.nextLine();
			System.out.println("Digite seu email.");
			String email = leia.next();
			System.out.println("Qual numero de quarto?");
			room = leia.nextInt();
			
			listaAlunos[room] = new Pensionato(nome,email,room);
		}
		
		for(int i =0; i < listaAlunos.length; i++) {
			if(listaAlunos[i] != null) {
			System.out.println(listaAlunos[i].getNome() + '\n' +listaAlunos[i].getEmail()+"\n"+listaAlunos[i].getRoom());
			i++;}
		}
	}

}
