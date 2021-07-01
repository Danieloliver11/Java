package hashCodeEequals;

public class Main {

	public static void main(String[] args) {

		/*
		 * hashCode e equals • São operações da classe Object utilizadas para comparar
		 * se um objeto é igual a outro • equals: lento, resposta 100% • hashCode:
		 * rápido, porém resposta positiva não é 100% •Tipos comuns (String, Date,
		 * Integer, Double, etc.) já possuem implementação para essas operações. Classes
		 * personalizadas precisam sobrepô-las.
		 */

		// EQUALS

		/* Método que compara se o objeto é igual a outro, retornando true ou false . */

		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b)); // FALSE

		// HashCode

		/*
		 * 
		 * Método que retorna um número inteiro representando um código gerado a partir
		 * das informações do objeto
		 */

		String c = "Maria";
		String d = "Alex";
		System.out.println(c.hashCode()); // 74113750

		System.out.println(d.hashCode()); // 2043454
		
		
		/*
		 * Regra de ouro do HashCode
• Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
*/
		
		//Isso nunca acontece:
		//	"Alex Larry Brown" =======> -242670543
		//  "Alex Larry Brown" =======>  880483901
		
		// • Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)
		
		System.out.println("-------------------------------------");
		
		//             HashCode e Equals personalizados
		
		Cliente c1 = new Cliente("maria", "maria@gmail.com");
		Cliente c2 = new Cliente("maria", "maria@gmail.com");
		
		
		System.out.println(c1.equals(c2)); // TRUE sao iguais !!!
		System.out.println(c1 == c2); // FALSE . NAO funciona o "==" já que ele compara apontando em memoria se o lugar esta na mesma referencia de memoria. Ja os obetos estao alocados em duas possicoes diferentes no heap
		System.out.println(c1.hashCode()); // -572735952
		System.out.println(c2.hashCode()); // -572735952
		
		/*
		 * true
		 * false
		 * 
		 * 
		 * hashCode
		-572735952
		-572735952*/
	}

}
