package org.serratec.aula09.principal;

import java.util.Scanner;

import org.serratec.aula09.modelos.Pizza;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("""
                === Menu da Pizzaria ===
                1. Cadastrar pizza
                2. Listar Pizza
                3. Sair                
                    """);
            };
            System.out.println("Selecione a opção: ");
            opcao = sc.nextInt();  
            
            switch (opcao) {
                case 1 -> Pizza.cadastrarPizza(Pizza.cardapio);
                case 2 -> Pizza.listarPizza(Pizza.cardapio);
                case 3 -> System.out.println("Encerrando a aplicação.");
                default -> System.out.println("Opção incorreta");
            }
        } while (opcao != 3);
    }
}