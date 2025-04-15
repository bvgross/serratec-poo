package org.serratec.aula08.modelos;
public class Eletronico extends Produto{
    private String marca;
    private int mesesGarantia;

    public Eletronico(String nome, double preco, int estoque, String marca, int mesesGarantia) {
        super(nome, preco, estoque);
        this.marca = marca;
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: %.2f | Estoque: %d | Marca: %s | %d meses de garantia.\n\n",
         getNome(), getPreco(), getEstoque(), marca, mesesGarantia);
    }

}
