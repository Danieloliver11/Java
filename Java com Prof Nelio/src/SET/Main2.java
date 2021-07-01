package SET;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		// [0, 2, 4, 5, 6, 7, 8, 9, 10]

		// intersection somento elementos que tem em comum nos conjuntos.
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		// [5, 6, 8, 10]

		// difference  remove todos do conjunto e que estao no conjunto b
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		// [0, 2, 4]


	}

}
