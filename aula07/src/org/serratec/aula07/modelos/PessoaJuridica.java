package org.serratec.aula07.modelos;

public class PessoaJuridica extends ImpostoDeRenda {

	private String cnpj;
	private String inscricaoEstadual;

	public PessoaJuridica(String nome, double rendimento, String cnpj, String inscricaoEstadual) {
		super(nome, rendimento);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public double calcularImposto() {
		return getRendimentos() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + "PessoaJuridica [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", calcularImposto()="
				+ calcularImposto() + "]";
	}
	
}
