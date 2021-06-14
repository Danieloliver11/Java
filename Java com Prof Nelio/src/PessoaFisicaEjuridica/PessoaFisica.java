package PessoaFisicaEjuridica;

public class PessoaFisica extends Conta{
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getCastosSaude() {
		return gastosSaude;
	}

	public void setCastosSaude(Double castosSaude) {
		this.gastosSaude = castosSaude;
	}
	
	public Double gastosComSaude() {
		
		return  this.gastosSaude * 0.50 ;
	}
	

	@Override
	public Double imposto() {
		Double imposto= 0.0;
		if(this.getRendaAnual() < 20000.00) {
			
			return imposto = ( this.getRendaAnual() * 0.15) - this.gastosComSaude();
			
		}else if(this.getRendaAnual() >= 20000.00) {
			return imposto = ( this.getRendaAnual() * 0.25) - this.gastosComSaude();
		}
		return imposto;
	}
	
	@Override
	public String toStrings() {
		
		return this.getNome() + ": $ " + imposto();
	}

	
}
