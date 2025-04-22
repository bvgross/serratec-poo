package principal;

import modelos.Estoque;
import modelos.Load;
import modelos.Save;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Estoque> produtos = Load.carregar("lista.csv");

        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        do {
            System.out.println("Adicione um produto.\nNome:");
            String nome = sc.nextLine();
            System.out.println("Quantidade:");
            int quantidade = sc.nextInt();
            sc.nextLine();
            produtos.add(new Estoque(nome, quantidade));
            System.out.println("Continuar (true/false)");
            continuar = sc.nextBoolean();
            sc.nextLine();
        } while (continuar) ;

        Save.salvar(produtos);
    }
}
