package org.serratec.aula06.principal;

import org.serratec.aula06.modelos.Gerente;
import org.serratec.aula06.modelos.Assistente;
import org.serratec.aula06.modelos.Funcionario;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Bruno Ventura Gross", 6000, "Desenvolvimento");
		Funcionario assistente = new Assistente("Maria", 2500, 500);
		
		System.out.println(gerente);
		System.out.println(assistente);
		
		gerente.aumentarSalario();
		assistente.aumentarSalario();
		
		System.out.println(gerente);
		System.out.println(assistente);
		
	}

}
