package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// permite a regra basica de fila: Primeiro a entrar é o primeiro a sair, FIFO

		// nao permite mudança de ordenaçao.

		Queue<String> filaBanco = new LinkedList<>();

		filaBanco.add("Jojo");
		filaBanco.add("Pedro");
		filaBanco.add("Mario");
		filaBanco.add("Leandro");
		filaBanco.add("Joao");

		System.out.println(filaBanco);

		// sempre iremos trabalhar com o primeiro elemento.

		// poll retorna e remove o primeiro elemento da fila. retorna null se nao tiver
		// mais elementos nessa fila.
		System.out.println("------------------");

		String clienteAserAtendidoString = filaBanco.poll();
		System.out.println(filaBanco);

		System.out.println(clienteAserAtendidoString);

		// peek retorna mais nao remove o primeiro elemento da fila. retorna null se nao
		// tiver mais elementos nessa fila.

		System.out.println("------------------");

		String clienteAserAtendidoString1 = filaBanco.peek();
		System.out.println(filaBanco);

		System.out.println(clienteAserAtendidoString1);

		// element retorna mais nao remove o primeiro elemento da fila. se a fila
		// estiver vazia, ele retorna uma excessao, NoSuchElementException

		System.out.println("------------------");

		String clienteAserAtendidoString2 = filaBanco.element();
		System.out.println(filaBanco);

		System.out.println(clienteAserAtendidoString2);

		
		
		
		/*
		 * [Jojo, Pedro, Mario, Leandro, Joao] 
		 * ------------------ 
		 * [Pedro, Mario, Leandro, Joao] 
		 * Jojo
		 *  ------------------ 
		 * [Pedro, Mario, Leandro, Joao]
		 *  Pedro
		 * ------------------ 
		 * [Pedro, Mario, Leandro, Joao]
		 *  Pedro
		 * 
		 * 
		 * 
		 * 
		 * 
		 * [] 
		 * ------------------ 
		 * [] null
		 *  ------------------ 
		 * [] null 
		 *  ------------------
		 * 
		 * Exception in thread "main" java.util.NoSuchElementException at
		 * java.base/java.util.LinkedList.getFirst(LinkedList.java:248) at
		 * java.base/java.util.LinkedList.element(LinkedList.java:667) at
		 * Queue.Main.main(Main.java:43)
		 */
	}

}
