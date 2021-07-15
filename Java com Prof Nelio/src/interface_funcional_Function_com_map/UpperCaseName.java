package interface_funcional_Function_com_map;

import java.util.function.Function;

public class UpperCaseName  implements Function<Product, String>{ // aplay tem dois tipos. O de entrada T, e o de saida R.

	@Override
	public String apply(Product p) { 
		return p.getNome().toUpperCase();
	}

}
