package PessoaFisicaEjuridica;

public class PessoaJuridica extends Conta {
	
	
	private Integer numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		Double imposto = 0.0;
		
		
		if(this.numeroFuncionarios <= 10) {
			return imposto = this.getRendaAnual() * 0.16;
			
		}else {
			return imposto =  this.getRendaAnual() * 0.14;

		}
		
		
	}
	
	@Override
	public String toStrings() {
		
		return this.getNome() + ": $ "+ String.format("%.2f", imposto());
	}
	
	

	
	

}
