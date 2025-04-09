package org.serratec.aula04.principal;

import org.serratec.aula04.modelos.Medico;

public class TestaMedico {

	public static void main(String[] args) {
		Medico carlosEduardo = new Medico("Carlos Eduardo", "1234-1", 8000, 300);
		Medico amanda = new Medico("Amanda", "4567-2", 9500, 350);
		Medico sofia = new Medico("Sofia", "4321-4", 6900, 200);
		Medico maria = new Medico("Maria", "7654-1", 12350, 700);
		
		sofia.realizarConsulta(true);
		maria.realizarConsulta(false);
		carlosEduardo.realizarConsulta(false);
		amanda.realizarConsulta(true);
		
		System.out.println("\nTotal de valores a pagar para o plano de saúde: " + Medico.getValorPlanoSaude());
		System.out.println(amanda);
	}
}