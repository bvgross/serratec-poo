package org.serratec.aula07.modelos;

public class Produto {
	private String nome;
	private double preco;
	private Categoria categoria;
	
	public Produto(String nome, double preco, Categoria categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + "]";
	}

}
