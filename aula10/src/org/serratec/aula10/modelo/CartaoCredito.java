package org.serratec.aula10.modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class CartaoCredito extends Pagamento {
    private int numeroCartao;
    private double valorTotalCompra;
    private int parcelas;

    public CartaoCredito(double valor, LocalDate dataVencimento, int parcelas, int numeroCartao) {
        super(valor, dataVencimento);
        this.numeroCartao = numeroCartao;
        this.valorTotalCompra = valor;
        this.parcelas = parcelas;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    @Override
    public void realizarPagemento() {
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Data do vencimento: " + getDataVencimento());
        System.out.println("Valor original: " + getValor());
        System.out.println("Valor da multa + juros: " + calcularMultaEAtraso());
        System.out.println("Em quantas parcelas deseja pagar (1 a 12) " + parcelas);
        double valorParcelas = getValor() / parcelas;
        System.out.println("O valor das parcelas é: " + valorParcelas);
    }
}
