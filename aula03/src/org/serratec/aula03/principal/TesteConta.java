package org.serratec.aula03.principal;

import java.util.Scanner;

import org.serratec.aula03.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta("0001", "0001-0", "Maria", 0);
		Conta conta2 = new Conta("0002", "0002-0", "João", 0);
		
		System.out.println("\nConta 1:");
		conta1.depositar(2500);
		conta1.transferir(500, conta2);
		conta1.exibirDados();

		System.out.println("\nConta 2:");
		conta2.depositar(200);
		conta2.exibirDados();
		conta2.sacar(1000);

	}
}