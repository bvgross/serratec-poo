package org.serratec.aula08.principal;

import java.util.List;

import org.serratec.aula08.modelos.Pessoa;

public class ListeParticipante {

    public static void listarParticipante(List<Pessoa> pessoas) {
        System.out.println("\n---- Lista de participantes ----");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoas.get(i));
        }
    }

}
