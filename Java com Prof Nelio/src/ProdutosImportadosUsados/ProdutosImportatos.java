package ProdutosImportadosUsados;

public class ProdutosImportatos extends Produtos{
	
	private Double custrofreet;

	public ProdutosImportatos(String nome, Double preco, Double custrofreet) {
		super(nome, preco);
		this.custrofreet = custrofreet;
	}

	public Double getCustrofreet() {
		return custrofreet;
	}

	public void setCustrofreet(Double custrofreet) {
		this.custrofreet = custrofreet;
	}
	
	@Override
	public String tag() {
		
		return this.getNome()+ " $ "+this.totalPreco()+" (Custo do frete: $ "+ this.custrofreet;
	}
	
	public Double totalPreco() {
		return this.custrofreet + this.getPreco();
	}
	
	

}
