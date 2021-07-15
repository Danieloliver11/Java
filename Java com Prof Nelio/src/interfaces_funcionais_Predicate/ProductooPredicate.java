package interfaces_funcionais_Predicate;

import java.util.function.Predicate;

/* O  Predicate, que é uma interface, que espera uma função 
 * logica, isto é, que avalia uma expressão booleana, e retorna true ou false. Essa função é executada chamando o método test, 
 * que executará a função passada como parâmetro. Ao ser avaliada, se essa função retornar verdadeiro, imprime o valor da lista, 
 * caso contrário, não imprime nada.*/

public class ProductooPredicate implements Predicate<Productoo> {

	@Override
	public boolean test(Productoo t) { // testa escluir da lista o produto que tenha o preco maior igual a 100

		return t.getPreco() >= 100.0; // retorna um true
	}

}
