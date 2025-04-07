package org.serratec.exercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		carro1.modelo = "Fusca";
		carro1.ano = 1968;
		carro1.cor = "Branco";
		carro1.valor = 68000;

		carro2.modelo = "Uno";
		carro2.ano = 1997;
		carro2.cor = "Preto";
		carro2.valor = 6800;

		carro3.modelo = "Marea";
		carro3.ano = 2002;
		carro3.cor = "Cinza";
		carro3.valor = 2000;

		carro1.imprimeDados();
		carro1.calcularDesconto(5);
		carro2.imprimeDados();
		carro2.calcularDesconto(10);
		carro3.imprimeDados();
		carro3.calcularDesconto(2);

		// System.out.println("Informe o modelo do carro: ");
		// String modelo = sc.nextLine();
		// System.out.println("Informe o ano do carro: ");
		// int ano = sc.nextInt();
		// sc.nextLine();
		// System.out.println("Informe a cor: ");
		// String cor = sc.nextLine();
		// System.out.println("Informe o valor ");
		// double valor = sc.nextDouble();
		//
		// double avaliacao = 0.0;
		// String textoAvaliacao = "";
		// do {
		// System.out.println("Digite uma avaliação de 0 a 10 ou número negativo para
		// encerrar: ");
		// avaliacao = sc.nextDouble();
		// if (textoAvaliacao.isBlank()) {
		// textoAvaliacao = "" + avaliacao;
		// } else if (avaliacao >= 0) {
		// textoAvaliacao += ", " + avaliacao;
		// }
		// } while (avaliacao >= 0.0);
		//
		// System.out.printf("\n\nCarro %s\nAno %d\nCor %s\nValor: R$ %.2f", modelo,
		// ano, cor, valor);
		// System.out.println("\nAvaliações: " + textoAvaliacao);
	}

}
