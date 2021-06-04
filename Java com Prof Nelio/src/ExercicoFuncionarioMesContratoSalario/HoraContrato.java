package ExercicoFuncionarioMesContratoSalario;

import java.time.LocalDate;
import java.util.Date;

public class HoraContrato {
	
	private Date data;
	private double valorDataHora;
	private Integer horas;
	
	public HoraContrato(Date dataContrato, double valorDataHora, int horas) {
		this.data = dataContrato;
		this.valorDataHora = valorDataHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorDataHora() {
		return valorDataHora;
	}

	public void setValorDataHora(double valorDataHora) {
		this.valorDataHora = valorDataHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	
	public Double valorTotal() {
		
		return valorDataHora * horas ;
		
	}
	
	

}
