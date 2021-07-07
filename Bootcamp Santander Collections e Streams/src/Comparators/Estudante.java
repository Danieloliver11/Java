package Comparators;

public class Estudante implements Comparable<Estudante> {

	private  String nome;
	private Integer idade;
	
	public Estudante(String nome, Integer idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

	@Override
	public String toString() {
		return nome + " - " + idade + " ";
	}

	@Override 
	// nossa regra de ordenacao. Vamos ordenar uma lista de estudantes. o numero negativo significa que o onjeto atual é menor que o que estamos comarando.0 significa que é o mesmo valor.
	public int compareTo(Estudante o) {
		return this.getIdade() - o.getIdade(); // atual - o valor de comparacao. teremos uma lista ordenada pela idade.
	}
	
	
	
	
	
}
