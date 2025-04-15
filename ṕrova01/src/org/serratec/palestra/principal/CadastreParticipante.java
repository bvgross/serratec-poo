package org.serratec.palestra.principal;

import java.util.List;
import java.util.Scanner;

import org.serratec.palestra.modelos.Palestrante;
import org.serratec.palestra.modelos.Participante;
import org.serratec.palestra.modelos.Pessoa;

public class CadastreParticipante {

    public static void cadastrarParticipante(List<Pessoa> pessoas) {
    Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o nome: ");
        String nome = sc.nextLine();
        System.out.println("\nDigite o CPF: ");
        String cpf = sc.nextLine();
        System.out.println("\nParticipante ou palestrante?");
        String modalidade = sc.nextLine().toLowerCase();
        if (modalidade.equals("participante")) {
            System.out.println("\nDigite o e-mail: ");
            String email = sc.nextLine();
            pessoas.add(new Participante(nome, cpf, email));
        } else if (modalidade.equals("palestrante")) {
            System.out.println("\nDigite o tema da palestra: ");
            String palestra = sc.nextLine();
            pessoas.add(new Palestrante(nome, cpf, palestra));
        } else {
            System.out.println("\n---- !Modalidade inválida. Voltando ao menu principal! ----");
        }
        
    }

}