package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// 
		Map<String, List<Integer>> teste = new HashMap<>();

		
		Map<String, Integer> campeaoMundial = new HashMap<>();
		
		campeaoMundial.put("Brasil", 5);
		campeaoMundial.put("Alemanha", 4);
		campeaoMundial.put("Italia", 4);
		campeaoMundial.put("Uruguai", 2);
		campeaoMundial.put("Argentina", 2);
		campeaoMundial.put("França", 2);
		campeaoMundial.put("Inglaterra", 2);
		campeaoMundial.put("Espanha", 1);
		
		System.out.println(campeaoMundial);
		// {Brasil=5, Argentina=2, Inglaterra=2, França=2, Uruguai=2, Espanha=1, Italia=4, Alemanha=4} sem ordem 
		
		campeaoMundial.put("Brasil", 6); //  atualiza o brasil
		
		System.out.println(campeaoMundial.containsKey("França")); // verifica se a chave existe true
		
		System.out.println(campeaoMundial.containsValue(6)); // verifica o valor. vai dar true, o brasile tem o valor de 6.
		
		System.out.println(campeaoMundial.size()); // tamanho 8 
		
		
		for(String key: campeaoMundial.keySet()) {
			
			System.out.println(key+ ", "+campeaoMundial.get(key)); 
		}
		/*
		 * 
		 *  Brasil, 6
			Argentina, 2
			Inglaterra, 2
			França, 2
			Uruguai, 2
			Espanha, 1
			Italia, 4
			Alemanha, 4 */

		
		


	}

}
