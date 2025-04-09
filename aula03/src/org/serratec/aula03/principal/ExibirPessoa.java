package org.serratec.aula03.principal;

import org.serratec.aula03.modelo.CalculosPessoa;
import org.serratec.aula03.modelo.Pessoa;

public class ExibirPessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Bruno", 1.81, 87);
		Pessoa pessoa2 = new Pessoa("Rayca", 1.56, 50);
		Pessoa pessoa3 = new Pessoa("Livia", 1.63, 52);
		Pessoa pessoa4 = new Pessoa("Cauã", 1.79, 85);

		CalculosPessoa.mediaPeso(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.mediaAltura(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.maiorPeso(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.maiorAltura(pessoa1, pessoa2, pessoa3, pessoa4);
		
		System.out.println("Total de pessoas instanciadas = " + Pessoa.totalPessoas);
	}
}
