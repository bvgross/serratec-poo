package org.serratec.palestra.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.palestra.modelos.Pessoa;

public class PalestraApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("""
                \n==== Palestras ====
                1. Cadastrar participante
                2. Listar participante
                3. Sair
                    """);
            
            System.out.println("Opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> CadastreParticipante.cadastrarParticipante(pessoas);
                case 2 -> ListeParticipante.listarParticipante(pessoas);
                case 3 -> System.out.println("\nAplicativo finalizado.");
                default -> System.out.println("\n--- !Opção incorreta. Digite novamente! ---");
            }
        
        } while (opcao != 3);
    }
}
