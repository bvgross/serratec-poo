package org.serratec.exercicios;

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int multiplicador = 0;
    while (multiplicador < 1 || multiplicador > 10) {
      System.out.println("Digite um multiplicador (1 a 10): ");
      multiplicador = sc.nextInt();
    }

    for (int i = 1; i <= 10; i++) {
      int total = i * multiplicador;
      System.out.println(i + " * " + multiplicador + " = " + total);
    }
  }
}
