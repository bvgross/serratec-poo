package org.serratec.aula06.modelos;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente{
	
	private String cpf;
	private LocalDate dataNascimento;
	private String rg;

	public ClientePessoaFisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}
			
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nCPF: %s RG: %s Data Nascimento: %s", cpf, rg, dataNascimento);
	}
	
}
