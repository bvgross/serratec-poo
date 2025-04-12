package org.serratec.aula07.modelos;

public class Categoria {
	private String nome;
	private String descricao;

	public Categoria(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
	
}
