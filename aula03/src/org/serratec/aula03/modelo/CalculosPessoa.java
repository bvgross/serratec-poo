package org.serratec.aula03.modelo;

import java.util.Iterator;

public class CalculosPessoa {
	
	public static void mediaPeso (Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double media = (pessoa1.getPeso() + pessoa2.getPeso() + pessoa3.getPeso() + pessoa4.getPeso()) / 4;
		System.out.println(media);
	}
	
	public static void mediaAltura (Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double media = (pessoa1.getAltura() + pessoa2.getAltura() + pessoa3.getAltura() + pessoa4.getAltura()) / 4;
		System.out.println(media);
	}
	
	public static void maiorPeso(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double[] pesos = {pessoa1.getPeso(), pessoa2.getPeso(), pessoa3.getPeso(), pessoa4.getPeso()};
		double maiorAltura = 0;
		for (int i = 0 ; i < 4 ; i++) {
			if (i == 0) {
				maiorAltura = pesos[0];
			} else if (maiorAltura < pesos[i]) {
				maiorAltura = pesos[i];
			}
		}
		System.out.println("A maior altura entre as pessoas é: " + maiorAltura);
	}
	
	public static void maiorAltura(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double[] pesos = {pessoa1.getAltura(), pessoa2.getAltura(), pessoa3.getAltura(), pessoa4.getAltura()};
		double maiorPeso = 0;
		for (int i = 0 ; i < 4 ; i++) {
			if (i == 0) {
				maiorPeso = pesos[0];
			} else if (maiorPeso < pesos[i]) {
				maiorPeso = pesos[i];
			}
		}
		System.out.println("A maior altura entre as pessoas é: " + maiorPeso);
	}


}
