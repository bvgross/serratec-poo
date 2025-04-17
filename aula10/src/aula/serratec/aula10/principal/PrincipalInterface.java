package aula.serratec.aula10.principal;

import org.serratec.aula10.modelo.Aluno;
import org.serratec.aula10.modelo.Coordenador;
import org.serratec.aula10.modelo.Professor;
import org.serratec.aula10.modelo.Situacao;

import java.util.ArrayList;
import java.util.List;

public class PrincipalInterface {
    public static void main(String[] args) {
        Aluno bruno = new Aluno(7, "Bruno");
        Professor rayca = new Professor("Rayca", "POO");
        Coordenador luizinnho = new Coordenador("Luiz", "manhã");

        List<Situacao> situacaoPessoas = new ArrayList<>();
        situacaoPessoas.add(bruno);
        situacaoPessoas.add(rayca);

        for (Situacao situacaoPessoa : situacaoPessoas) {
            System.out.println(situacaoPessoa.verificarSituacao());
        }


    }
}
