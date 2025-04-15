package org.serratec.palestra.modelos;

public class Palestrante extends Pessoa{
    private String temaPalestra;

    public Palestrante(String nome, String cpf, String temaPalestra) {
        super(nome, cpf);
        this.temaPalestra = temaPalestra;
    }

    @Override
    public void exibirDados(){

    }

    @Override
    public String toString() {
        return super.toString() + " | Tema da Palestra: " + temaPalestra;
    }
    
}
