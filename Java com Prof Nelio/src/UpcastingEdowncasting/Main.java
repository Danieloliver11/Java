package UpcastingEdowncasting;

public class Main {

	public static void main(String[] args) {
		
		/*
Upcasting: Quando queremos converter uma classe Sub para Super class, usamos Upcasting (ou ampliação). 
Isso acontece automaticamente, sem necessidade de fazer nada explicitamente. 

Downcasting: Quando queremos lançar uma classe Super para Sub, usamos Downcasting (ou estreitamento),
 e Downcasting não é diretamente possível em Java, explicitamente temos que fazer.*/
		
		
		
		/*•
		 *  Upcasting
• Casting da subclasse para superclasse
• Uso comum: polimorfismo

*/

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		
		/*
		 * 
		 * • Downcasting
• Casting da superclasse para subclasse

*/
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			acc5.withdraw(0); // metodo de account 
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
	
	
}
