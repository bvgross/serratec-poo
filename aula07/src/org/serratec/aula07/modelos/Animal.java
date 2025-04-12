package org.serratec.aula07.modelos;

public abstract class Animal {
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public abstract void emitirSom();
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + "]";
	}
	
}
