package org.serratec.aula03.modelo;

public class Pessoa {
	private String nome;
	private double altura;
	private double peso;
	public static int totalPessoas = 0;
	
	public Pessoa (String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		totalPessoas++;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getNome() {
		return nome;
	}
}
