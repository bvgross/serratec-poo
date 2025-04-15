package org.serratec.aula08.principal;

import org.serratec.aula08.modelos.*;

public class TestaProduto {

    public static void main(String[] args) {
        Produto feijao = new Alimento("Feijão", 12, 45, 1, UnidadeMedida.KG);
        feijao.exibirInformacoes();
        Produto computador = new Eletronico("PC", 5500, 3, "Dell", 5);
        computador.exibirInformacoes();
    }

}
