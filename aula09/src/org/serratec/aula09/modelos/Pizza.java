package org.serratec.aula09.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {
    private String nome;
    private double preco;
    private Tipo tipo;
    private String descricao;
    public static List<Pizza> cardapio = new ArrayList<>();
   
    public Pizza(String nome, double preco, Tipo tipo, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Pizza [nome=" + nome + ", preco=" + preco + ", tipo=" + tipo + ", descricao=" + descricao + "]";
    }

    public static void cadastrarPizza(List<Pizza> cardapio ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tipo: ");
        String tipoPizza = sc.nextLine().toUpperCase();
        Tipo tipo = Tipo.valueOf(tipoPizza);
        System.out.println("Descrição: ");
        String descricao = sc.nextLine();
        cardapio.add(new Pizza(nome, preco, tipo, descricao));
    }

    public static void listarPizza(List<Pizza> cardapio) {
        for(int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i));
        }
    }
    
}
