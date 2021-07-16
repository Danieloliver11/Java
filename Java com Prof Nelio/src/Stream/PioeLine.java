package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PioeLine {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y); // reduce ele pega um elemento inicial "elemento neutro da operacao"e depois uma funcao que recebe dois argumentos e recebe um resultado.
		
		System.out.println("Sum = " + sum);
		
		// filter apenas os elementos que satisfacao o predicado
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList()); 
		
		System.out.println(Arrays.toString(newList.toArray())); // list tambem tem a operacao toArray
		// [40, 100]

	}

}
