package org.serratec.aula11.principal;

import org.serratec.aula11.modelos.CalculoFrete;
import org.serratec.aula11.modelos.FreteExpresso;
import org.serratec.aula11.modelos.FreteNormal;

import java.util.List;

public class TestaFrete {
    public static void main(String[] args) {
        List<CalculoFrete> fretezinhos = List.of(new FreteNormal(), new FreteExpresso());
        for (CalculoFrete f : fretezinhos) {
            System.out.println(f.getClass().getSimpleName().equals("FreteNormal") ?
                "Frete normal" + ": R$ " + f.calcular(5) : "Frete expresso" + ": R$ " + f.calcular(5));
        }


    }
}
