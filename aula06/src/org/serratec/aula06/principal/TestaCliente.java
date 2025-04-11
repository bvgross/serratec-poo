package org.serratec.aula06.principal;

import java.time.LocalDate;

import org.serratec.aula06.modelos.Cliente;
import org.serratec.aula06.modelos.ClientePessoaFisica;
import org.serratec.aula06.modelos.ClientePessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente pessoaFisica = new ClientePessoaFisica("Bruno Ventura Gross", "bvgross@gmail.com", "369.675.318-16");
		Cliente pessoaJuridica = new ClientePessoaJuridica("Padaria do João", "padoca@gmail.com", "12568843/0001-99");
		
		((ClientePessoaFisica) pessoaFisica).setDataNascimento(LocalDate.parse("200-10-15"));
		
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);

	}

}
