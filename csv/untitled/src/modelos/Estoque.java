package modelos;

public class Estoque {
    private String nome;
    private int quantidade;

    public Estoque(String nome, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
