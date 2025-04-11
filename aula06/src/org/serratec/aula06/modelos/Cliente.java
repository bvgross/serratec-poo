package org.serratec.aula06.modelos;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String email;
	private LocalDate dataCadastro;
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.dataCadastro = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Clinte [nome=" + nome + ", email=" + email + "]";
	}
	
}
