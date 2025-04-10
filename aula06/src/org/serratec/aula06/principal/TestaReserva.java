package org.serratec.aula06.principal;

import org.serratec.aula06.modelos.Cliente;
import org.serratec.aula06.modelos.Quarto;
import org.serratec.aula06.modelos.Reserva;
import org.serratec.aula06.modelos.TipoQuarto;

public class TestaReserva {

	public static void main(String[] args) {
		Reserva reserva1 = new Reserva(new Cliente("Bruno Ventura Gross", "bvgross@gmail.com"), new Quarto(204, TipoQuarto.CASAL), 5);
		Reserva reserva2 = new Reserva(new Cliente("Erika Ventura Gross", "evg@gmail.com"), new Quarto(301, TipoQuarto.LUXO), 3);
		
		System.out.println(reserva1);
		System.out.println(reserva2);
		
	}

}
