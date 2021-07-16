package Ex20Stream_filter_sorted_map_reduce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
/*
	Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv (suponha que exista pelo menos um produto).
	Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.
	Veja exemplo na próxima página.
	
	
	Tv,900.00
	Mouse,50.00
	Tablet,350.50
	HD Case,80.90
	Computer,850.00
	Monitor,290.00
	
	*/
	
	public static void main(String[] args) {
		
		String path = "/Users/danielmacedodeoliveira/Source.txt";
		
		List<Produto> produtos = new ArrayList<>();
		
		

		try (BufferedReader arquivo = new  BufferedReader(new FileReader(path))){
			
			String linha = arquivo.readLine();
			
			while (linha != null) {
				
				String[] campos = linha.split(",");
				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1]);
				
				Produto prod = new Produto(nome, preco);	
				
				produtos.add(prod);
				
			
				
				linha = arquivo.readLine();
			}
			
			
			// reduce permite somar os precos 
			// reduce ele pega um elemento inicial "elemento neutro da operacao"e depois uma funcao que recebe dois argumentos e recebe um resultado.
			Double avg = produtos.stream().map(x -> x.getPreco()).reduce(0.0, (a,b)-> a + b) / produtos.size();  // media dos precos produtos
			
			System.out.println("Media dos preços :" + String.format("%.2f", avg));
			
			
			
			
			// deixa os nomes decrescente. 
			Comparator<String> comp = (a,b) -> a.toUpperCase().compareTo(b.toUpperCase());
			
			List<String> nomes = produtos.stream().filter(x -> x.getPreco() < avg).map(p -> p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());
			
			nomes.forEach(System.out::println);
			
			
			/*
			 
			Media dos preços :420,23
			Tablet
			Mouse
			Monitor
			HD Case
			
			*/
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
