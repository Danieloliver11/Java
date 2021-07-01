package ExercicioSetTotalCursoAluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/*
	 * Em um portal de cursos online, cada usuário possui um código único,
	 * representado por um número inteiro. Cada instrutor do portal pode ter vários
	 * cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
	 * Assim, o número total de alunos de um instrutor não é simplesmente a soma dos
	 * alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em
	 * mais de um curso. O instrutor Alex possui três cursos A, B e C, e deseja
	 * saber seu número total de alunos. Seu programa deve ler os alunos dos cursos
	 * A, B e C do instrutor Alex, depois mostrar a quantidade total e alunos dele,
	 * conforme exemplo.

*
		How many students for course A? 3 
		21
		35
		22
		How many students for course B? 2 21
		50
		How many students for course C? 3 42
		35
		13
		Total students: 6 
		
		*/
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int aa = leia.nextInt();
		
		for(int x = 0; x< aa; x++) {
			int cod = leia.nextInt();
			a.add(cod);
		}
		
		System.out.println("How many students for course B?");
		int bb = leia.nextInt();
		
		for(int x = 0; x< bb; x++) {
			int cod = leia.nextInt();
			b.add(cod);
		}
		
		System.out.println("How many students for course C?");
		int cc = leia.nextInt();
		
		for(int x = 0; x< cc; x++) {
			int cod = leia.nextInt();
			c.add(cod);
		}
		
		Set<Integer> resul = new HashSet<>(a);
		resul.addAll(b);
		resul.addAll(c);
		
		System.out.println(resul.size());
		
		for(Integer y: resul) {
			System.out.println(resul);
		}
		leia.close();
		
		
	}

}
