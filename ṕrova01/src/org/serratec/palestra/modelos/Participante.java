package org.serratec.palestra.modelos;

public class Participante extends Pessoa{
    private String email;

    public Participante(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    @Override
    public void exibirDados(){

    }

    @Override
    public String toString() {
        return super.toString() + " | e-mail: " + email;
    }

}