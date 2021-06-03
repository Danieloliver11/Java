package matriz;

import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
 *  podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, 
 *  mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.

3 4

10 8 15 12
21 11 23 8
14 5 13 19
8
Position 0,1: Left: 10 
Right: 15 
Down: 11 
Position 1,3: 
Left: 23
Up: 12
Down: 19

 */
public class MatrizEdirecao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Quantas lolunas sua matriz vai ter?");
		int ll = leia.nextInt();
		System.out.println("Quantas colunas sua matriz vai ter?");
		int cc = leia.nextInt();
		
		int[][] matriz = new int[ll][cc];
		
		for(int l = 0 ; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				int m = leia.nextInt();
				matriz[l][c] = m;
				
			}
		}
		
		for(int l = 0 ; l < matriz.length; l++) {
			System.out.println("");
			for(int c = 0; c < matriz[l].length; c++) {
				
				System.out.print(matriz[l][c]+"  ");
				
			}
		}
		
		
		System.out.println("\nDigite a posição da  linha da nossa matriz");
		ll = leia.nextInt();
		System.out.println("Digite a posição da colunas da nossa matriz?");
		cc = leia.nextInt();
		
		System.out.println(matriz[ll][cc]);
		System.out.println("\nDireita: "+matriz[ll][cc+1]);
		System.out.println("Esquerda: "+matriz[ll][cc-1]);
		System.out.println("Cima: "+matriz[ll-1][cc]);
		System.out.println("baixo: "+matriz[ll+1][cc]);

		
	}

}
