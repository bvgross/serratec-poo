package org.serratec.aula06.modelos;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private int ano;
	private Pessoa proprietario;
	
	public Veiculo(String modelo, String placa, int ano, Pessoa proprietario) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.proprietario = proprietario;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", proprietario=" + proprietario
				+ "]";
	}
	
}
