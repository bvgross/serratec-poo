package org.serratec.aula07.principal;

import org.serratec.aula07.modelos.Assistente;
import org.serratec.aula07.modelos.Diretor;
import org.serratec.aula07.modelos.Funcionario;
import org.serratec.aula07.modelos.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario diretor = new Diretor("Bruno Ventura Gross", 25000);
		Funcionario gerente = new Gerente("Erika Ventura Gross", 12000);
		Funcionario assistente = new Assistente("Joãozinho", 5000, 300);
		
		diretor.aumentarSalario();
		gerente.aumentarSalario();
		assistente.aumentarSalario();
		
		System.out.println(diretor);
		System.out.println(gerente);
		System.out.println(assistente);
	}

}
