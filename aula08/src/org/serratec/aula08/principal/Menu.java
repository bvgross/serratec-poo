package org.serratec.aula08.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.aula08.modelos.*;

public class Menu {
    private Scanner leitura = new Scanner(System.in);
    private List<Produto> produtos = new ArrayList<>();

    public void Iniciar() {
        int opcao;
        
        do {
            String menu = """
                    \n ---- Menu SerraCommerce ----
                    1. Cadastrar produto
                    2. Listar produto
                    3. Realzar venda
                    4. Aumentar estoque
                    5. Sair                    
                    \nEscolha uma opção:
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProduto();                
                case 2 -> listarProdutos();
                case 3 -> realizarVenda();
                case 4 -> aumentarEstoque();
                case 5 -> System.out.println("Encerrando a aplicação...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

    }

    private void realizarVenda() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }
        System.out.println("\nEscolha o número do produto que à vender: ");
        int indice = leitura.nextInt() - 1;
        if (indice < 0 || indice > produtos.size()) {
            System.out.println("Produto inválido.");
            return;
        }
        System.out.println("\nQuantidade a vender: ");
        int quantidade = leitura.nextInt();
        if (produtos.get(indice).vender(quantidade)) {
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Estoque insuficiente. Operação não realizada.");
        }
    }

    private void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("---- Não existem produtos cadastrados. ----");
            return;
        }
        for (int i = 0; i < produtos.size(); i++) {
            System.out.print((i + 1) + ". ");
            produtos.get(i).exibirInformacoes();
        }
    }

    private void cadastrarProduto() {
        System.out.println("\nTipo do produto: ");
        System.out.println("1. Alimento");
        System.out.println("2. Eletrônico");
        System.out.println("Escolha a opção desejada: ");
        int tipo = leitura.nextInt();
        leitura.nextLine();
        
        if (tipo != 1 && tipo != 2) {
            System.out.println("Opção inválida. Voltando ao menu anterior...");
            return;
        }

        System.out.println("\nNome do produto: ");
        String nome = leitura.nextLine();
        System.out.println("Preço: ");
        double preco = leitura.nextDouble();
        System.out.println("Quantidade em estoque: ");
        int estoque = leitura.nextInt();
        leitura.nextLine();

        if (tipo == 1) {
            System.out.println("Quantidade por item: ");
            int quantidadePorItem = leitura.nextInt();
            leitura.nextLine();
            System.out.println("Unidade de medida: (KG, G, L, ML, UN): ");
            String unidade = leitura.nextLine().toUpperCase();
            UnidadeMedida unidadeMedida = UnidadeMedida.valueOf(unidade);
            produtos.add(new Alimento(nome, preco, estoque, quantidadePorItem, unidadeMedida));
        } 
        if (tipo == 2) {
            System.out.println("Marca: ");
            String marca = leitura.nextLine();
            System.out.println("Meses de garantia:");
            int mesesGarantia = leitura.nextInt();
            leitura.nextLine();
            produtos.add(new Eletronico(nome, preco, estoque, marca, mesesGarantia));
        }

        System.out.println("Produto cadastrado com sucesso.");
    }

    private void aumentarEstoque() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }
        System.out.println("\nProduto: ");
        int indice = leitura.nextInt() - 1;
        if (indice < 0 || indice > produtos.size()) {
            System.out.println("Produto inválido.");
            return;
        }
        System.out.println("Adicionar quantos items: ");
        produtos.get(indice).acrescentarEstoque(leitura.nextInt());
        leitura.nextLine();
    }
}
