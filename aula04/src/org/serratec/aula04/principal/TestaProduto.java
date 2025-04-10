package org.serratec.aula04.principal;

import java.util.Scanner;

import org.serratec.aula04.modelos.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resposta = "S";

		do {
			System.out.println("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Valor: ");
			double valor = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			Produto produto = new Produto(nome, valor, quantidade);
			
			//System.out.println("Produto cadastrado!");
			produto.mostrarProduto();
			
			System.out.println("Deseja fazer um novo cadastro (S/N)?");
			resposta = sc.nextLine();
		} while (resposta.equalsIgnoreCase("S"));
		//} while (resposta == "S" || resposta == "s");
	}

}
