package org.serratec.aula08.modelos;

public abstract class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public abstract void exibirInformacoes();

    public boolean vender(int quantidade) {
        if(quantidade <= estoque) {
            estoque -= quantidade;
            return true;
        } 
        return false;
    }

}
