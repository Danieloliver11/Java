package interface_funcional_Function_com_map;

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

	public static String  nomeStatico(Product p) {// metodo statico nao mexe com o parametro do objeto, apenas com o seu parametro ele modifica.
		return p.getNome().toUpperCase();
	}
	
	public  String nonStaticoNome() {// agora ele mexe com o price do próprio objeto
		return getNome().toUpperCase();
	}
	
	
	
	@Override
	public String toString() {
		return "Productoo [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}
	
	

}
