package org.serratec.aula08.modelos;

public class Alimento extends Produto{
    private int quantidadePorItem;
    private UnidadeMedida unidadeMedida;

    public Alimento(String nome, double preco, int estoque, int quantidadePorItem, UnidadeMedida unidadeMedida) {
        super(nome, preco, estoque);
        this.quantidadePorItem = quantidadePorItem;
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: %.2f | Estoque: %d | Descrição: %d %s\n\n",
         getNome(), getPreco(), getEstoque(), quantidadePorItem, unidadeMedida);
    }

}
