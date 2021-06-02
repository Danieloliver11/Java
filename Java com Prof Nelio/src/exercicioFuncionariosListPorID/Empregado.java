package exercicioFuncionariosListPorID;

public class Empregado {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	
	

	
	public void aumento(double percentage) {
			this.salario += salario * percentage / 100.0;
		}
	//formata a saida dos meus objetos!
	public String toString() {
		return "ID: "+ this.id + ", Nome: " + this.nome + ", Salario: " + String.format("%.2f", this.salario);
	}
	
	
	
	
	
	
}
