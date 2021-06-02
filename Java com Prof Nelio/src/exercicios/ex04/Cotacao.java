package exercicios.ex04;

public class Cotacao {
	private static final double IOF = 6.0;
	private static final double dolar = 3.10;
	private static double reais;
	
	
	
	public static double getReais() {
		return reais;
	}
	public void setReais(double reais) {
		this.reais = reais;
	}
	public static double getIof() {
		return IOF;
	}
	public static double getDolar() {
		return dolar;
	}
	
	public static double cotacao() {
		 
		 double resudolarImposto = ( (getIof()/100) *  ( getReais() * getDolar()) );
		 double CustoDolar = getReais() * getDolar();
		 return CustoDolar + resudolarImposto;
	}
	
	
}
