package exercicios.ex03;

import java.util.Scanner;

public class NotaAluno {
	public static void main (String[]  args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite as notas do aluno");
		/*int n1 = leia.nextInt();
		int n2 = leia.nextInt();
		int n3 = leia.nextInt();*/
		
		
		Aluno pedro = new Aluno(27,31,32);
		
		System.out.println("FINAL GRADE = "+pedro.media());
		pedro.nota();
		
		
	}
}
