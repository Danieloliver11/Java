package Polimorfismo;

public class Main {
	public static void main(String[] args) {
	
	
		/*
		 
		 Polimorfismo
	Em Programação Orientada a Objetos, polimorfismo é recurso que
	permite que variáveis de um mesmo tipo mais genérico possam
	apontar para objetos de tipos específicos diferentes, tendo assim
	comportamentos diferentes conforme cada tipo específico.
	
	
	
	
	
	
	Importante entender
	
• A associação do tipo específico com o tipo genérico é feita em tempo de
execução (upcasting).

• O compilador não sabe para qual tipo específico a chamada do método
Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account):
*/
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		// Mesmo metodo com o mesmo nome, polimorfismo!
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance()); // 945.0 POLIMORFISMO DO METODO withdraw de Acoount  
			/*
			 public void withdraw(double amount) {
				balance -= amount + 5;
	}
	*/

		
		System.out.println(y.getBalance());// 950.0 POLIMORFISMO DO METODO withdraw de SavingsAccount
		
		/*
		 @Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	*/


	
	
	
	
	
	}

}
