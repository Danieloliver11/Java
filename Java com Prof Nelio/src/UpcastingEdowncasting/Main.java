package UpcastingEdowncasting;

public class Main {

	public static void main(String[] args) {
		
		/*relacao É UM: OBJETO X TAMBÉM É UM OBJETO Y.
		  



		 CASTING DE OBJETOS 
		 
		 
		 
Upcasting: Quando queremos converter uma classe Sub para Super class, usamos Upcasting (ou ampliação). 
Isso acontece automaticamente, sem necessidade de fazer nada explicitamente. 

Downcasting: Quando queremos lançar uma classe Super para Sub, usamos Downcasting (ou estreitamento),
 e Downcasting não é diretamente possível em Java, explicitamente temos que fazer.*/
		
		
		
		/*•
		 
		 Upcasting
• Casting da subclasse para superclasse
• Uso comum: polimorfismo

*/

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0); //os 3 primeiros parametros sao de herança da Account ultimo parametro é  empréstimoLimite
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);// acc2 é um objeto do tipo account com os parametros de BusinessAccount
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		
		// DOWNCASTING
		
		
		/*
		 * 
		 * • Downcasting
• Casting da superclasse para subclasse

*/
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; [ERRO]
		if (acc3 instanceof BusinessAccount) {  // VAI DAR ERRO PORQUE ACC3 do tipo account nao tem parametros de BusinessAccount!
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			acc5.withdraw(0); // metodo de account  !!!!!
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) { // aqui ira dar certo acc3 tem parametros de SavingsAccount! entao conseguimos fazer um Downcasting!!!
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
			
			
			//
			acc5.withdraw(0); // conseguimos usar metodos de account e
			acc5.updateBalance();// conseguimos usar os metodos da subclasse SavingsAccount.
		}
	}
	
	
}
