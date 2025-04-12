package org.serratec.aula07.modelos;

public abstract class Funcionario {
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

	public abstract void aumentarSalario();
	
	public void exibirSalarioAtualizado() {
		System.out.printf("Salario de %s atualizado para %.2f", nome, salario );
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
