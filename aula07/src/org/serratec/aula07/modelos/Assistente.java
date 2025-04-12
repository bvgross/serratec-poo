package org.serratec.aula07.modelos;

public class Assistente extends Funcionario{
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	@Override
	public void aumentarSalario() {
		salario += adicional;
	}

	@Override
	public String toString() {
		return "Assistente [salario=" + salario + "]";
	}
	
}
