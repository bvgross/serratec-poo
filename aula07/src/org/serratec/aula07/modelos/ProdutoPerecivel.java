package org.serratec.aula07.modelos;

public class ProdutoPerecivel extends Produto{
	private String dataValidade;

	public ProdutoPerecivel(String nome, double preco, Categoria categoria, String dataValidade) {
		super(nome, preco, categoria);
		this.dataValidade = dataValidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + "ProdutoPerecivel [dataValidade=" + dataValidade + "]";
	}

}
