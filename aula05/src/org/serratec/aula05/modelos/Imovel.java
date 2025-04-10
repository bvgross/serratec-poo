package org.serratec.aula05.modelos;

public class Imovel {
	String local;
	TipoImovel tipo;
	double valor;
	Pessoa dono;
	Endereco endereco;
	
	public Imovel(Endereco endereco, String local, TipoImovel tipo, double valor, Pessoa dono) {
		this.local = local;
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
		this.endereco = endereco;

	}
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public TipoImovel getTipo() {
		return tipo;
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Imovel [local=" + local + ", tipo=" + tipo + ", valor=" + valor + ", dono=" + dono + ", endereco="
				+ endereco + "]";
	}
	
	
	
}
