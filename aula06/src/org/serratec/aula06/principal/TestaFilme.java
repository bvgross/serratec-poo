package org.serratec.aula06.principal;

import org.serratec.aula06.modelos.Diretor;
import org.serratec.aula06.modelos.Filme;
import org.serratec.aula06.modelos.GeneroFilme;

public class TestaFilme {

	public static void main(String[] args) {
		Filme bladeRunner = new Filme("Blade Runner", 1982, GeneroFilme.FICCAO_CIENTIFICA, new Diretor("Ridley Scott", "EUA"));
		Filme cinemaParadiso = new Filme("Nuovo Cinema Paradiso", 1990, GeneroFilme.DRAMA, new Diretor("Giuseppe Tornatore", "Itália"));
		
		System.out.println(bladeRunner);
		System.out.println(cinemaParadiso);
	}

}
