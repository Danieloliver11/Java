
package Ex20Stream_filter_sorted_map_reduce;

import java.math.BigInteger;

public class Produto {
	
	private String nome;
	
	private Double preco;

	public Produto(String nome, Double preco) {
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

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}
	
	

}
