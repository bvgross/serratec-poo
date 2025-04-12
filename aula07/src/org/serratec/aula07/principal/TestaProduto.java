package org.serratec.aula07.principal;

import org.serratec.aula07.modelos.Categoria;
import org.serratec.aula07.modelos.Produto;
import org.serratec.aula07.modelos.ProdutoPerecivel;

public class TestaProduto {

	public static void main(String[] args) {
		Categoria laticinios = new Categoria("Laticínios", "Produtos feitos do leite");
		Categoria carnes = new Categoria("Carnes", "Produtos feitos da vaca");
		Produto queijoBrie = new ProdutoPerecivel("Queijo Brie", 220, laticinios, "25/05/2026");
		Produto picanha = new ProdutoPerecivel("Picanha", 70, carnes, "30/10/2025");
		
		System.out.println(queijoBrie);
		System.out.println(picanha);
	}

}
