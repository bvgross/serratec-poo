package org.serratec.aula07.modelos;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + "]";
	}

	public void aumentarSalario() {
		salario += salario * .1;
	}

}
