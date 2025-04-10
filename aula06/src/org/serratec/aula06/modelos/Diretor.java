package org.serratec.aula06.modelos;

public class Diretor {
	private String nome;
	private String nacionalidade;

	public Diretor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
	}
	
}
