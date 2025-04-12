package org.serratec.aula07.modelos;

public class PessoaFisica extends ImpostoDeRenda{
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, double rendimento, String cpf, String rg) {
		super(nome, rendimento);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	@Override
	public double calcularImposto() {
		if(rendimento <= 2000) {
			return 0;
		} else if (rendimento <= 5000) {
			return rendimento * .15;
		} else {
			return rendimento * .275;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", calcularImposto()=" + calcularImposto() + "]";
	}
	
}
