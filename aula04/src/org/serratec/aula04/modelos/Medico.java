package org.serratec.aula04.modelos;

public class Medico {
	private String nome;
	private String crm;
	private double salario;
	private double valorConsulta;
	private static double valorPlanoSaude;
	
	public Medico(String nome, String crm, double salario, double valorConsulta) {
		this.nome = nome;
		this.crm = crm;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public String getNome() {
		return nome;
	}

	public String getCrm() {
		return crm;
	}
	
	public static double getValorPlanoSaude() {
		return valorPlanoSaude;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + ", salario=" + salario + ", valorConsulta=" + valorConsulta
				+ "]";
	}
	
	public void realizarConsulta(Boolean isPlano) {
		double consulta = 0;
		if (isPlano) {
			consulta = valorConsulta * 0.7;
			salario += valorConsulta * 0.7;
			valorPlanoSaude += valorConsulta * 0.3;
		} else {
			salario += valorConsulta;
			consulta = valorConsulta;
		}
		System.out.println("O valor da consulta do(a) doutor(a) " + this.getNome() + " é: R$" + consulta);
	}
}
