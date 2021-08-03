package troco;
import java.util.Scanner;

public class exDinheiroEtroco {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// continue a solucao de acordo com as notas do enunciado 576
		int notasInseridas = leitor.nextInt();
		int atual = notasInseridas;
		int notas100 = atual / 100; // 5
		atual = atual % 100; // 76
		int notas50 = atual / 50; // 1
		atual = atual % 50; // 52
		int notas20 = atual / 20; // 1
		atual = atual % 20;// 6
		int notas10 = atual / 10;
		atual = atual % 10;
		int notas5 = atual / 5;
		atual = atual % 5;
		int notas2 = atual / 2;
		atual = atual % 2;
		int notas1 = atual / 1;

		// continue a solucao de acordo com os exemplos de saída
		System.out.println(notasInseridas);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");

	}

}
