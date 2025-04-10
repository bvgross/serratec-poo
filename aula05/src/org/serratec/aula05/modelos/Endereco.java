package org.serratec.aula05.modelos;

public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;

	public Endereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade,
			String uf) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "\nEndereço: " + logradouro + ", " + numero + " - complemento: " + complemento
				+ ", bairro: " + bairro + ", cep: " + cep + ", cidade: " + cidade + " - " + uf ;
	}
}