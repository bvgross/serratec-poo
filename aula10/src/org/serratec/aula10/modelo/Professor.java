package org.serratec.aula10.modelo;

public class Professor implements Situacao{
    private String nome;
    private String materia;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    @Override
    public String verificarSituacao() {
        return "O professor " + nome + " que ministra a disciplina " +  materia + " teve seu contrato renovado.";
    }
}
