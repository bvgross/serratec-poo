package org.serratec.aula07.principal;

import java.time.LocalDate;

import org.serratec.aula07.modelos.Animal;
import org.serratec.aula07.modelos.AnimalEstimacao;
import org.serratec.aula07.modelos.AnimalExtinsao;

public class TestaAnimal {
	public static void main(String[] args) {
		Animal galinha = new AnimalEstimacao("Galinhazinha", LocalDate.parse("2025-08-29"));
		Animal onca = new AnimalExtinsao("Pintadinha", "22488-2");
	}
}
