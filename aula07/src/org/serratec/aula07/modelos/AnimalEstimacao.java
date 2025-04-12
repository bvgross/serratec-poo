package org.serratec.aula07.modelos;

import java.time.LocalDate;

public class AnimalEstimacao extends Animal{
	private LocalDate dataVacinacao;

	public AnimalEstimacao(String nome, LocalDate dataVacinacao) {
		super(nome);
		this.dataVacinacao = dataVacinacao;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("qué qué");
	}

	@Override
	public String toString() {
		return super.toString() + "AnimalEstimacao [dataVacinacao=" + dataVacinacao + "]";
	}

	
}
