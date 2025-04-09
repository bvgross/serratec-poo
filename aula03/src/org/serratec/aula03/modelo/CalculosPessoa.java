package org.serratec.aula03.modelo;

public class CalculosPessoa {
	
	public static void mediaPeso (Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double media = (pessoa1.getPeso() + pessoa2.getPeso() + pessoa3.getPeso() + pessoa4.getPeso()) / 4;
		System.out.println("A média de peso das pessoas é: " + media);
	}
	
	public static void mediaAltura (Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		double media = (pessoa1.getAltura() + pessoa2.getAltura() + pessoa3.getAltura() + pessoa4.getAltura()) / 4;
		System.out.println("A média de altura das pessoas é: " + media);
	}
	
	public static void maiorPeso(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		Pessoa[] pessoas = {pessoa1, pessoa2, pessoa3, pessoa4};
		Pessoa pessoaMaisPesada = pessoas[0];
		for (int i = 0 ; i < 4 ; i++) {
			if (pessoaMaisPesada.getPeso() < pessoas[i].getPeso()) {
				pessoaMaisPesada = pessoas[i];
			}
		}
		System.out.println("A pessoa mais pesada entre as pessoas é: " + pessoaMaisPesada.getNome());
	}
	
	public static void maiorAltura(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3, Pessoa pessoa4) {
		Pessoa[] pessoas = {pessoa1, pessoa2, pessoa3, pessoa4};		
		Pessoa pessoaMaisAlta = pessoas[0];
		for (int i = 0 ; i < 4 ; i++) {
			if (pessoaMaisAlta.getAltura() < pessoas[i].getAltura()) {
				pessoaMaisAlta = pessoas[i];
			}
		}
		System.out.println("A pessoa mais alta entre as pessoas é: " + pessoaMaisAlta.getNome());
	}


}
