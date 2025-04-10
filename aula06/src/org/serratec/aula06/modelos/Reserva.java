package org.serratec.aula06.modelos;

public class Reserva {
	private Cliente cliente;
	private Quarto quarto;
	private int quatitdadeDias;
	
	public Reserva(Cliente cliente, Quarto quarto, int quatitdadeDias) {
		super();
		this.cliente = cliente;
		this.quarto = quarto;
		this.quatitdadeDias = quatitdadeDias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public int getQuatitdadeDias() {
		return quatitdadeDias;
	}

	public void setQuatitdadeDias(int quatitdadeDias) {
		this.quatitdadeDias = quatitdadeDias;
	}

	@Override
	public String toString() {
		return "Reserva [cliente=" + cliente + ", quarto=" + quarto + ", quatitdadeDias=" + quatitdadeDias + "]";
	}
}
