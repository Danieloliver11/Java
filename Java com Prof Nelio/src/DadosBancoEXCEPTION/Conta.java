package DadosBancoEXCEPTION;


public class Conta {
	
	private Integer numero;
	private String order;
	private Double saldo;
	private Double saqueLimite;
	
	public Conta(Integer numero, String order, Double saldo, Double saqueLimite)  {
		super();
		
		this.numero = numero;
		this.order = order;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Double getSaldo() {
		return saldo;
	}


	public Double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(Double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}
	
	
	
	
	public void deposito(Double conta) {
		this.saldo += conta; 
	}
	
	// throws DomainException  propaga a excecao para o meu programa principal tratar{
	public void saque(Double saque) throws DomainException  {
		
		validSaque(saque); // a informacao ira fazer a avaliacao. se der Exception o throw já retorna a Exception.
		
		this.saldo -= saque;
	}
	
	// metodo para validar uma excecao
	public void validSaque (Double saque) throws DomainException {
		
		if(this.saqueLimite > this.saldo) {
			// erro saldo menor que o saquelimite!
			throw new DomainException("Saldo menor que o saque limite!");
		}
		 if(this.saqueLimite < saque) {
			throw new DomainException("O saque não pode ser maior que o limite de saque!");
		
	}
		}

}
