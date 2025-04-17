package org.serratec.aula10.modelo;

public class Coordenador {
    private String nome;
    private String turno;

    public Coordenador(String nome, String turno) {
        this.nome = nome;
        this.turno = turno;
    }

    public void exibirDados() {
        System.out.println("O coordenador " + nome +  " trabalha no seguinte turno: " + turno);
    }
}
