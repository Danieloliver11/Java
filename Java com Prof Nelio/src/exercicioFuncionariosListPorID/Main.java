package exercicioFuncionariosListPorID;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/* v n 96
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver 
 repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o
valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos
funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. 
Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.*/

public class Main {
	public static void main(String[] args)  {
		
	  //Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Integer idd=0;
		
			System.out.println("Quantos empregados você tem ?");
			int numero = leia.nextInt();
			
			List<Empregado> listaDeEmpregados = new ArrayList<>();
			
			for(int i = 0 ; i< numero; i++) {
				
				System.out.println("Qual o ID do funcionario?");
				idd = leia.nextInt();
				leia.nextLine();
				System.out.println("Qual o nome do funcionario?");
				String nome = leia.nextLine();
				
				System.out.println("Qual o salario do seu fincionario?");
				Double salario = leia.nextDouble();
				
				//joga nossa lista e o id nessa funcao hasId do tipo boolean e volta verdadeiro ou falso. se Nao voltar nada é porque o boolean é falso entao jogamos para cadastrar o id no ELSE. SE TIVER O ID  é VERDADEIRO
				while(hasId(listaDeEmpregados , idd)) {
					
					System.out.println("[ERRO] Esse Id já foi cadastrado!");
					System.out.println("Digite novamente o ID do funcionario");
					idd = leia.nextInt();
				
				}
				
				Empregado p = new Empregado(idd,nome,salario);
				listaDeEmpregados.add(p);
					
					
				
			}
			
			System.out.println("Digite o ID do seu funcionario para beneficiar para um aumento de salario!.");
			int id = leia.nextInt();
			
			//Integer benefic = temID.(listaDeEmpregados , id);
			
			// pega o objeto funcionario pelo ID! usando o filter usando um lambda e pego o primeiro que venha na lista findFirst() se nao volta Null
			Empregado beneficio = listaDeEmpregados.stream().filter(empregadoX -> empregadoX.getId() == id).findFirst().orElse(null); 
																		// ->tal qual
			
			
			if(beneficio != null) {
				System.out.println("Digite a porcentagem do aumento do salario do funcionario "+beneficio.getNome());
				Double porcento =leia.nextDouble(); 
				
				beneficio.aumento(porcento);
				
				System.out.println("Lista de funcionarios");
				
				//listaDeEmpregados.get(benefic).aumento(porcento);
				
			}else {System.out.println("Não temos nenhum funcionario com esse ID!");}
						
			for(Empregado  x : listaDeEmpregados) {
				System.out.println(x.toString());
			}
			
			
			
			
			System.out.println("FIM");
			
	
	
	}
	
	// aqui vai tentar achar o id e retornar para ver se ele ja existe assim nao cadastramos o mesmo id.
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado empregadoiD = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return empregadoiD != null; // SE TIVER algum retorno é porque temos já um id.
	}
	
	
	
	//OUTRA maneira de achar um objeto por um id específico na lista. return i, retorna  o objeto que tem esse id. ELSE retorna Nulo.
	public static Integer temID(List<Empregado>lista,int id) {
		for(int i=0;i< lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
	
	
}
