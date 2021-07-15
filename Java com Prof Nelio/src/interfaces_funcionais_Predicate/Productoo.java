package interfaces_funcionais_Predicate;

public class Productoo {
	
	private String nome;
	private Double preco;
	
	public Productoo(String nome, Double preco) {
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

	//• Reference method com método estático
	
	public static boolean staticProductPredicate(Productoo t) {
		
		return t.getPreco() >= 100.0;
	}
	
	//• Reference method com método não estático
	public  boolean nonStaticProductPredicate() { // como nao é static, ele ira trabalhar com o produto dessa classe, e nao o que vem por argumento 
		
		return this.preco >= 100.0;
	}
	
	
	@Override
	public String toString() {
		return "Productoo [nome=" + nome + ", preco=" + preco + "]";
	}
	
	

}
