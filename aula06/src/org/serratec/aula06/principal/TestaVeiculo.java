package org.serratec.aula06.principal;

import org.serratec.aula06.modelos.Pessoa;
import org.serratec.aula06.modelos.Veiculo;

public class TestaVeiculo {

	public static void main(String[] args) {

		Veiculo fusca = new Veiculo("VW Fusca", "1234-123", 1965, new Pessoa("Bruno Ventura Gross", "369.675.318-16", "24999150402"));
		Veiculo uno = new Veiculo("Fiat Uno", "4567-745", 1995, new Pessoa("Erika Ventura Gross", "456.315.585-22", "61985429898"));		
		
		System.out.println(fusca);
		System.out.println("\n" + uno);
		
	}

}
