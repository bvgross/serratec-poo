package org.serratec.aula06.modelos;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private String turno;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario() {
		salario += salario * 0.02;
	}
	
	public void exibirSalarioAtualizado() {
		System.out.printf("Salario de %s atualizado para %.2f", nome, salario );
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
