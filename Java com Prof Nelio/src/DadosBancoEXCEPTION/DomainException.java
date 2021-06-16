package DadosBancoEXCEPTION;
//Exception ou RuntimeException // Exception sou obrigado a tratar as minhas excecoes com try catch!

//CRIANDO Exception personalizadas
public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}

}