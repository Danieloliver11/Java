package Curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class princípioGetPut {
	
	// quero um lista que seja uma lista dwe qualquer tipo Numerico.
	// e o seugndo paramentro, sera uma lista de destino. Uma lista MAIS GENERICA que uma lista de numeros. ela pode ser uma lista de OBJECT
							//covariância                            contravariância
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> lista) {
		for(Object obj: lista) {
			System.out.print(obj + " ");
		}
		
	}
	
	

	public static void main(String[] args) {
		/* Princípio get/put 
		 * 
		 * Vamos fazer um método que copia os elementos de uma lista para uma outra
		 * lista que pode ser mais genérica que a primeira.
		 * 
		 */

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
		
		// resultado do print :  1 2 3 4  1 2 3 4 3.14 6.28 

		
		
		
		// Princípio get/put - covariância

		// PODE SER UM TIPO OU UM SUBTIPO  DELE
		// uma List qualquer tipo que estende de Number
		List<? extends Number> list = intList;

		Number x = list.get(0); // conseguimos aPENAS aCESSAR ESSE NUMERO DESSA LSITA

		list.add(20); // erro de compilacao MAS NAO É POSSIVEL Adicionar / o combilador NAO SABE SE
						// ESSSE NUMERO INTEIRO É CAMPATIVEL COM OUTRO TIPO NUMBER

		/*
		 * get - OK put - ERROR
		 * 
		 */
		
		//Princípio get/put - contravariância
		
		
		List<Object> myObjsS = new ArrayList<Object>();  //POSSO ADICIONAR OBJETOS DE QUALQUER TIPO
		myObjs.add("Maria");// STRING É UM SUBTIPO DE OBJET ENTAO ESTA OK
		myObjs.add("Alex");
		myObjs.add(99);

		// PODE SER UM TIPO OU UM SUPER TIPO DELE
		//QUALQUER TIPO QUE SEJA SUPERTIPO DE NUMBER
		List<? super Number> myNums = myObjs;
		myNums.add(10); 
		myNums.add(3.14);

		 Number x = myNums.get(0); // erro de compilacao o TIPO DESSA LISTA PODE SER UM SUPER TIPO DE NUMBER 
		
		/* get - ERROR 
		 * put - OK*/

	}

}
