package org.serratec.exercicios;

public class Carro {
  String modelo;
  int ano;
  String cor;
  double valor;

  void imprimeDados() {
    System.out.println("\nCarro: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
    System.out.println("Valor: R$" + valor);
  }

  void calcularDesconto(double percentual) {
    double valorComDesconto = valor - (valor * (percentual / 100));
    System.out.println("Valor com desconto (" + percentual + "%)" + ": R$" + valorComDesconto);
  }

}
