package modelos;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Veiculo {
    private String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public abstract String exibirTipo();
    
    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + "]";
    }

    static public void criarLista() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro("var-12345"));
        listaVeiculos.add(new Moto("vic-72344"));
        listaVeiculos.add(new Moto("tru-82145"));
        listaVeiculos.add(new Carro("cha-12634"));
        listaVeiculos.add(new Carro("rus-46345"));

        for(int i = 0; i < listaVeiculos.size(); i++) {
            if(listaVeiculos.get(i) instanceof Carro) {
                System.out.println("Quantas portas tem esse carro? ");
                ((Carro)listaVeiculos.get(i)).setNumeroDePortas(sc.nextInt());
            } else {
                System.out.println("Essa moto tem bagageiro (true/false)? ");
                ((Moto)listaVeiculos.get(i)).setTemBagageiro(sc.nextBoolean());
            }
        }

        for(int i = 0; i < listaVeiculos.size(); i++) {
            System.out.println(listaVeiculos.get(i).toString());
        }
    }
    
}
