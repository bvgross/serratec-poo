package org.serratec.aula07.modelos;

public class ImpostoDeRenda {
	private String nome;
	protected double rendimento;
	
	public ImpostoDeRenda(String nome, double rendimento) {
		this.nome = nome;
		this.rendimento = rendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendimentos() {
		return rendimento;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimento = rendimentos;
	}
	
	public double calcularImposto() {
		return rendimento * 0.015;
	}

	@Override
	public String toString() {
		return "ImpostoDeRenda [nome=" + nome + ", rendimentos=" + rendimento + "]";
	}
	
}
