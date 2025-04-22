package modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Load {
    public static List<Estoque> carregar(String filename) {
        List<Estoque> alimentos = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean primeiraLinha = true;

            while ((line = reader.readLine()) != null) {
                if(primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] partes = line.split(",");

                String nome = partes[0];
                int quantidade = Integer.parseInt(partes[1]);

                alimentos.add(new Estoque(nome, quantidade));
            }
            System.out.println("Arquivo carregado.");
        } catch (IOException e) {
            System.out.println("CSV não encontrado, começando com uma lista vazia.");
        }
        return alimentos;
    }
}
