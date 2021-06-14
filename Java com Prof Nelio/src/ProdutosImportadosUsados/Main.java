package ProdutosImportadosUsados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). 
 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
 Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo (próxima página).
  Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
	Favor implementar o programa conforme projeto ao lado.
*/

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner leia = new Scanner(System.in);
		
		SimpleDateFormat dma = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produtos>listaProdutos = new ArrayList<>();
		
		System.out.println("Entre com o numero de produtos");
		int n = leia.nextInt();
		
		for(int x= 0; x< n; x++) {
			System.out.println("O produto é comum, usado ou importado? (c/u/i)");
			char a = leia.next().charAt(0);
			
			if(a == 'c') {
				System.out.println("Nome do produto?");
				String nome = leia.next();
				
				System.out.println("Preço do produto.");
				double preco = leia.nextDouble();
				
				
				Produtos produto = new Produtos(nome,preco);
				
				listaProdutos.add(produto);
			}else if(a == 'u') {
				
				System.out.println("Nome do produto?");
				String nome = leia.next();
				
				System.out.println("Preço do produto.");
				double preco = leia.nextDouble();
				
				System.out.println("Qual a data da manufaura? (dd/MM/yyyy)");
				Date data = dma.parse(leia.next());
				
				Produtos produtoUsado = new ProdutosUsados(nome,preco,data);
				
				listaProdutos.add(produtoUsado);
				
				
			}else if(a == 'i') {
				
				System.out.println("Nome do produto?");
				String nome = leia.next();
				
				System.out.println("Preço do produto.");
				double preco = leia.nextDouble();
				
				System.out.println("Quanto custou o frete?");
				double frete = leia.nextDouble();
				
				Produtos produtosInport = new ProdutosImportatos(nome, preco, frete);
				
				listaProdutos.add(produtosInport);
				
			}
			
			
			
			
			
		}
		System.out.println("PRICE TAGS:");
		
		for(Produtos y :listaProdutos) {
			
			System.out.println(y.tag());
		}
		
		
		
	}

}
