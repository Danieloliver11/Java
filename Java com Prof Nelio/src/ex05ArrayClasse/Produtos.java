package ex05ArrayClasse;

public class Produtos {
	private String produto;
	private double preco;
	
	
	public Produtos(String produto, double preco) {
		super();
		this.produto = produto;
		this.preco = preco;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
