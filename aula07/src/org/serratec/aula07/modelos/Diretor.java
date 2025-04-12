package org.serratec.aula07.modelos;

public class Diretor extends Funcionario{

	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentarSalario() {
		salario += salario * 0.2;
	}

	@Override
	public String toString() {
		return "Diretor [salario=" + salario + "]";
	}
	
	
}
