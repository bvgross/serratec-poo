package org.serratec.aula05.modelos;

public class Pessoa {
	String cpf;
	String nome;
	String telefone;
	
	public Pessoa(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	
}
