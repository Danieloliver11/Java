package ExercicoFuncionarioMesContratoSalario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar 
 *qual foi o salário do funcionário nesse mês, conforme exemplo (próxima página).
 * 
 * 
 * 
 * 
Enter department's name: Design Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3 Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018 Name: Alex
Department: Design
Income for 08/2018: 3000.00

ex de composicao. cap119

*/

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner leia = new Scanner(System.in);
		
		SimpleDateFormat d_m_a = new SimpleDateFormat("dd/MM/yyyy"); // configura o jeito que quero que a data seja inserida 
		
		System.out.println("Digite seu departamento!");
		String departamento = leia.nextLine();
		
		System.out.println("Digite seus dados. nome, nivel de trabalho e seu salario Base.");
		
		System.out.println("Seu nome: ");
		String nome = leia.next();
		
		System.out.println("Seu nivel de trabalho: JUNIOR/PLENO/SENIOR");
		String nivel = leia.next();
		
		
		System.out.println("Digite seu salario base:");
		double salario = leia.nextDouble();
		
		System.out.println("Quantos contratos você tem?");
		int contratos = leia.nextInt();
																								// new Departamento porque temos que passar os valores para essa clase ja que ela tem construtror
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel),salario, new Departamento(departamento));
		
		// vezes que vamos colocar nossas informacoes de HoraContrato
		for(int x=0 ; x < contratos; x++) {
			
			System.out.println("Entre com o contrato; "+ (x + 1));
			//contrato
			
			System.out.println("Data do contrato:(dd/MM/yy)");
			Date dataContrato = d_m_a.parse(leia.next());// pega a data digitada do tipo String, passa para o formato selecionado na objeto d_m_a e passa para a variavel que é um tipo dataContrato
			
			
			System.out.println("Qual foi o seu valor por hora?");
			double valorHora = leia.nextDouble();
			
			System.out.println("Quantas horas você tabalhou?");
			int horaTrabalhada = leia.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato,valorHora,horaTrabalhada);
			
			trabalhador.addContrato(contrato); //isso associa o contrato com o trabalhador.
				
		}
		
		System.out.println("Entre com o mês e ano, para calcular a renda dessa data. (MM/yy)");
		SimpleDateFormat m_a = new SimpleDateFormat("MM/yyyy"); 
		Date conMesAno = m_a.parse(leia.next());
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(conMesAno);
		
		int mes = 1 + cal.get(Calendar.MONTH);
		int ano = cal.get(Calendar.YEAR);
		
		
		
		
		
		System.out.println("Nome: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("Renda: "+ mes+"/"+ano+" : " + String.format("%.2f", trabalhador.renda(mes, ano)));
	
		
		
		
		/*
		 * para recortar uma String por parametro e jogar essa parte convertida em int em uma variavel.
		 
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		
		*/
		
		
	}

	

}
