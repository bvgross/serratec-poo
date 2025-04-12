package org.serratec.aula07.modelos;

public class AnimalExtinsao extends Animal{
	private String numeroIdentificadorIbama;

	public AnimalExtinsao(String nome, String numeroIdentificadorIbama) {
		super(nome);
		this.numeroIdentificadorIbama = numeroIdentificadorIbama;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("socorro!");
	}


	@Override
	public String toString() {
		return super.toString() + "AnimalExtinsao [numeroIdentificadorIbama=" + numeroIdentificadorIbama + "]";
	}
	
}
