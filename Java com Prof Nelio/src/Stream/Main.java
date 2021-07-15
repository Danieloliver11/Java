package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		/*
		 * Operações intermediárias
		 * 
		 * 
		 * • filter • map • flatmap • peek • distinct • sorted • skip • limit (*)
		 * short-circuit PARA assim que for satisfeita
		 * 
		 * Operações terminais • forEach • forEachOrdered • toArray • reduce • collect •
		 * min • max • count • anyMatch (*) • allMatch (*) • noneMatch (*) • findFirst
		 * (*) • findAny (*)
		 * 
		 * short-circuit PARA assim que for satisfeita
		 */

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream();
		
		System.out.println(Arrays.toString(st1.toArray())); // toArray converte a STREAM PARA UM VETOR.
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // COLOCA OS ELEMENTOS DIRETAMENTE EM parênteses 
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // ITERATE VAI INTERANDO + 2 NOS ELEMENTOS. 
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));// limit limita até 10 a interacao de +2 
		
		// sequência de fibonacci
		
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

	}

}
