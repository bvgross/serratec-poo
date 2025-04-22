package modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Save {
    public static void salvar(List<Estoque> produtos) {
        try (
            FileWriter writer = new FileWriter("lista.csv")) {
            // header
            writer.write("nome,quantidade\n");
            // linhas
            for (Estoque p : produtos) {
                writer.write(p.getNome() + "," + p.getQuantidade() + "\n");
            }
            System.out.println("Arquivo salvo!");
        } catch (
            IOException e) {
            e.printStackTrace();
        }
    }
}
