package Enum;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(2334 , new Date(),OrderStatus.PROCESSANDO);
		
		System.out.println(pedido.toString());
		
		//Conversão de String para enum
		
		OrderStatus ord1 = OrderStatus.AGUARDANDO_PAGAMENTO;
		OrderStatus ord2 = OrderStatus.valueOf("AGUARDANDO_PAGAMENTO");
		System.out.println(ord1);
		System.out.println(ord2);
	}

}
