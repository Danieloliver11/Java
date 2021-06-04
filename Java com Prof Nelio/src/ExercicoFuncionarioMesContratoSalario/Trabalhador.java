package ExercicoFuncionarioMesContratoSalario;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador level;
	private double salarioBase;
	
	
	
	private List<HoraContrato> horaContratos = new ArrayList<>(); // ja temos que instanciar por padrao, porque a lista precisa ser instanciada JA NA DECLARACAO DO ATRIBUTO!/
	
	private Departamento departamento;
	
	
	public Trabalhador(String nome, NivelTrabalhador level, double salarioBase, 
			Departamento departamento) {
		super();
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public Trabalhador() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NivelTrabalhador getLevel() {
		return level;
	}
	public void setLevel(NivelTrabalhador level) {
		this.level = level;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<HoraContrato> getHoraContratos() {
		return horaContratos;
	}

	public void addContrato(HoraContrato contrato) {
		
		horaContratos.add(contrato);
	}
	public void removeContrato(HoraContrato contrato) {
		horaContratos.remove(contrato);
	}
	
	// calcula a renda do mes ano "data"
	public Double renda(int mes, int ano) {
		double resul = this.salarioBase;
		Calendar cal = Calendar.getInstance(); //pega calendario gregoriano
		
		
		for(HoraContrato x : horaContratos) {
			
			cal.setTime(x.getData());
			int mees = 1 + cal.get(Calendar.MONTH);
			int anoo = cal.get(Calendar.YEAR);
			
			if(mes ==  mees && ano == anoo) {
				
				 resul = resul + x.valorTotal();
				
			}
		}
		
		
		
		return resul;
		
		
	}
	
	

}
