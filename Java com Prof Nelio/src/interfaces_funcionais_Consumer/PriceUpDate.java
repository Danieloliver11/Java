package interfaces_funcionais_Consumer;

import java.util.function.Consumer;

public class PriceUpDate implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		 t.setPreco(t.getPreco() * 1.1); // ajuste de 10%
		
	}

}
