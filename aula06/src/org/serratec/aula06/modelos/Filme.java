package org.serratec.aula06.modelos;

public class Filme {
	private String titulo;
	private int ano;
	private GeneroFilme genero;
	private Diretor diretor;
	
	public Filme(String titulo, int ano, GeneroFilme genero, Diretor diretor) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.diretor = diretor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public GeneroFilme getGenero() {
		return genero;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", ano=" + ano + ", genero=" + genero + ", diretor=" + diretor + "]";
	}

	
}
