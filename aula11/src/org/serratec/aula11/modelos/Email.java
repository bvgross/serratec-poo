package org.serratec.aula11.modelos;

public class Email implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
