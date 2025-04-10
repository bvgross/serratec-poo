package org.serratec.aula05.principal;

import org.serratec.aula05.modelos.Endereco;
import org.serratec.aula05.modelos.Imovel;
import org.serratec.aula05.modelos.Pessoa;
import org.serratec.aula05.modelos.TipoImovel;

public class TesteImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel(new Endereco("Rua José", 12, "Sobreloja", "Vila Felipe", "25668-201", "Petrópolis", "RJ"),"Rua 1", TipoImovel.CASA, 500000.0,
				new Pessoa("36967531816", "Bruno Ventura Gross", "24999150402"));
		
		System.out.println(imovel1);
	}

}
