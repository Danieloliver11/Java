package interfaces_funcionais_Consumer;

public class Product {
	
	private String nome;
	private Double preco;
	
	public Product(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static void staticPrice(Product p) {// metodo statico nao mexe com o parametro do objeto, apenas com o seu parametro ele modifica.
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public  void nonStaticPrice() {// agora ele mexe com o price do próprio objeto
		setPreco(getPreco() * 1.1);
	}
	
	
	
	@Override
	public String toString() {
		return "Productoo [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}
	
	

}
