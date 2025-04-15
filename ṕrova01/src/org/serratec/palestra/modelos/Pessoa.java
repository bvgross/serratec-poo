package org.serratec.palestra.modelos;

public abstract class Pessoa {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public abstract void exibirDados();

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }

}
