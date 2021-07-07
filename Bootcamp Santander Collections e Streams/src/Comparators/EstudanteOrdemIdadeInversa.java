package Comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeInversa implements Comparator<Estudante> { //Comparator recebe dois argumentos. para ser criado em uma classe externa a do dominio . Posso fazer varias regras de negocio com a classe Estudante.

	
	@Override
	public int compare(Estudante o1, Estudante o2) {
		return o2.getIdade() - o1.getIdade();

	}

}
