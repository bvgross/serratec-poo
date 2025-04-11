package org.serratec.aula06.modelos;

public class ClientePessoaJuridica extends Cliente{

	private String cnpj;
	private String cadastroEstadual;
	
	public ClientePessoaJuridica(String nome, String email, String cnpj) {
		super(nome, email);
		this.cnpj = cnpj;
	}

	public String getCadastroEstadual() {
		return cadastroEstadual;
	}

	public void setCadastroEstadual(String cadastroEstadual) {
		this.cadastroEstadual = cadastroEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("CNPJ: %s", cnpj);
	}
	
}
