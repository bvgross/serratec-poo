package org.serratec.aula03.principal;

import org.serratec.aula03.modelo.CalculosPessoa;
import org.serratec.aula03.modelo.Pessoa;

public class ExibirPessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Bruno", 87, 1.81);
		Pessoa pessoa2 = new Pessoa("Rayca", 50, 1.56);
		Pessoa pessoa3 = new Pessoa("Livia", 52, 1.63);
		Pessoa pessoa4 = new Pessoa("Cauã", 85, 1.79);
		
		CalculosPessoa.mediaPeso(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.mediaAltura(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.maiorPeso(pessoa1, pessoa2, pessoa3, pessoa4);
		CalculosPessoa.maiorAltura(pessoa1, pessoa2, pessoa3, pessoa4);
	}
}
