package org.serratec.aula11.principal;

import org.serratec.aula11.modelos.Email;
import org.serratec.aula11.modelos.Notificacao;
import org.serratec.aula11.modelos.SMS;

import java.util.List;

public class TestaNotificacao {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = List.of(new Email(), new SMS(), new Email());

        for (Notificacao n : notificacoes) {
            n.enviar("Seu pedido foi enviado com sucesso!");
        }
    }
}
