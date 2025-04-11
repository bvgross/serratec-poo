package org.serratec.aula06.modelos;

public class Gerente extends Funcionario{
	private String setor;

	public Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	@Override
	public String toString() {
		return super.toString() + "Gerente [setor=" + setor + "]";
	}
	
	public void aumentarSalario() {
		super.aumentarSalario();
		salario += 200;
	}

}
