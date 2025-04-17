package aula.serratec.aula10.principal;

import org.serratec.aula10.modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagamento pix = new Pix(1000, LocalDate.parse("2025-04-10"), "bvgross@gmail.com");
        pix.realizarPagemento();
        System.out.println("\n================\n");
        Pagamento cartao = new CartaoCredito(2000, LocalDate.parse("2025-03-10"), 12, 5254654 );
        cartao.realizarPagemento();
        Pagamento paypal = new PayPal(1500, LocalDate.parse("2025-04-03"), "bvgross@gmail.com");
        cartao.realizarPagemento();

        List<Pagavel> origemPagamento = new ArrayList<>();
        origemPagamento.add((Pix) pix);
        origemPagamento.add((PayPal) paypal);

        for (int i = 0; i < origemPagamento.size(); i++) {
            origemPagamento.get(i).informarOrigemPagamento(TipoOrigem.CONTA_CORRENTE);
        }
    }
}
