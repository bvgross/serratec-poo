package org.serratec.aula07.principal;

import org.serratec.aula07.modelos.ImpostoDeRenda;
import org.serratec.aula07.modelos.PessoaFisica;
import org.serratec.aula07.modelos.PessoaJuridica;

public class TesteImposto {

	public static void main(String[] args) {
		ImpostoDeRenda pf = new PessoaFisica("Bruno Ventura Gross", 5000, "369.675+318-16", "2646377");
		ImpostoDeRenda pj = new PessoaJuridica("Padaria Aninha", 150000, "2185487/102-102", "12345");
		
		System.out.println(pf);
		System.out.println(pj);

	}

}
