package ExercicioSet213;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

	/*
	 * Problema exemplo 
	 * Um site de internet registra um log de acessos dos usuários.
	 * Um registro de log consiste no nome de usuário (apenas uma palavra) e o
	 * instante em que o usuário acessou o site no padrão ISO 8601, separados por
	 * espaço, conforme exemplo. Fazer um programa que leia o log de acessos a
	 * partir de um arquivo, e daí informe quantos usuários distintos acessaram o
	 * site.
	 * 
			 * input file: 213.txt
		amanda 2018-08-26T20:45:08Z
		alex86 2018-08-26T21:49:37Z
		bobbrown 2018-08-27T03:19:13Z
		amanda 2018-08-27T08:11:00Z
		jeniffer3 2018-08-27T09:19:24Z
		alex86 2018-08-27T22:39:52Z
		amanda 2018-08-28T07:42:19Z
		
		Execution:
		Enter file full path: c:\temp\in.txt 
		Total users: 4
	 */
	public static void main(String[] args) {

		String  file = "/Users/danielmacedodeoliveira/213.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			Set<User> set = new HashSet<>();
			
			String linha = br.readLine();
			
			while(linha != null) {
				
				String[] parametros = linha.split(" ");
				
				String nome = parametros[0];
				Date data = Date.from(Instant.parse(parametros[1]));
				
				User usuario = new User(nome,data);
				set.add(usuario);
				
				linha = br.readLine();
				
			}
			
			System.out.println("Total usuarios "+ set.size()); // precisamos do equals e hashCode no User para nao deixar repetir um usuario
			// o total de usuarios que nao se repetem sao 4.
			
					
						
			for(User x: set) {
				System.out.println(x.toString());
				
				/* Total usuarios 4
				amanda, Sun Aug 26 17:45:08 BRT 2018
				jeniffer3, Mon Aug 27 06:19:24 BRT 2018
				alex86, Sun Aug 26 18:49:37 BRT 2018
				bobbrown, Mon Aug 27 00:19:13 BRT 2018 */
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
