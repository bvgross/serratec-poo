package org.serratec.aula04.principal;

import java.util.Scanner;

import org.serratec.aula04.modelos.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resposta = "S";
		while (resposta == "S") {
			String nome = "";
			double valor = 0;
			int quantidade = 0;
			
			System.out.println("Nome do produto: ");
			nome = sc.nextLine();
			System.out.println("Valor: ");
			valor = sc.nextDouble();
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			sc.nextLine();
			Produto produto = new Produto(nome, valor, quantidade);
			System.out.println("Deseja fazer um novo cadastro (S/N)?");
			resposta = sc.nextLine();
		}
	}

}
