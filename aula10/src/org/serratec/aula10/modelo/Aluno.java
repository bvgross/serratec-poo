package org.serratec.aula10.modelo;

public class Aluno implements Situacao{
    private String nome;
    private int ano;

    public Aluno(int ano, String nome) {
        this.ano = ano;
        this.nome = nome;
    }

    @Override
    public String verificarSituacao() {
        return "O aluno " + nome + " está matriculado.";
    }
}
