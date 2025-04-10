package org.serratec.aula04.modelos;

public class Produto {
	private String descricao;
	private double valor;
	private int quantidade;
	private double total;
	private double icms;
	
		
	public Produto(String descricao, double valor, int quantidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.total = calcularTotal(valor, quantidade);
		this.icms = calcularIcms(valor, quantidade);
	}
	
	// getters e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getIcms() {
		return icms;
	}
	
	public double getTotal() {
		return total;
	}

	public double calcularTotal(double valor, int quantidade) {
		return valor * quantidade;
	}

	public double calcularIcms(double valor, int quantidade) {
		return calcularTotal(valor, quantidade) * 0.12;
	}
	
	public void mostrarProduto() {
		System.out.println("------------------------------");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Total: " + getTotal());
		System.out.println("IMCS total: " + getIcms());
		System.out.println("------------------------------");
	}
}
