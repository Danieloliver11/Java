package Map;

import java.util.Map;
import java.util.TreeMap;

public class Mani {

	public static void main(String[] args) {
		
		// Map<K,V>
		
		/*• É uma coleção de pares chave / valor
		• Não admite repetições do objeto chave
		• Os elementos são indexados pelo objeto chave (não possuem posição) • Acesso, inserção e remoção de elementos são rápidos
		
		• Uso comum: cookies, local storage, qualquer modelo chave-valor
		
		• Principais implementações:
		
		• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
		• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
		• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		
		Alguns métodos importantes
		
		
		• put(key, value), remove(key), containsKey(key), get(key)
		• Baseado em equals e hashCode
		• Se equals e hashCode não existir, é usada comparação de ponteiros
		
		
		• clear() 
		• size()
		
				
		• keySet() - retorna um Set<K>
		• values() - retornaa um Collection<V>
		*/
		
		
		Map<String, String> cookies = new TreeMap<>();// TreeMap ordena pela chave 
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email");  // remove o registro  pela chave 
		cookies.put("phone", "99771133");// escreve pos cima da chave phone já nao pode ter duas key phone.
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));// ve se temos uma chave com o nome phone na lista: true
		System.out.println("Phone number: " + cookies.get("phone")); // pega o valor da chave phone 
		System.out.println("Email: " + cookies.get("email"));// elemento nao existe 
		System.out.println("Size: " + cookies.size());// 2 elementos
		System.out.println("ALL COOKIES:"); 
		
		System.out.println("--------------");
		for (String key : cookies.keySet()) { // keySet pega as chaves da lsita
		System.out.println(key + ": " + cookies.get(key)); // pega o valor de cada key e printa 

	}


	}
	}
