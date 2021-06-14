package ProdutosImportadosUsados;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos{
	
	SimpleDateFormat dma = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataManufatura;

	public ProdutosUsados(String nome, Double preco, Date dataManufatura) {
		super(nome, preco);
		this.dataManufatura = dataManufatura;
	}
	
	@Override
	public String tag() {
		
		return this.getNome()+ " $ "+this.getPreco()+" (Data da manufatura: $ "+ dma.format(dataManufatura);
	}
	
	
	

}
