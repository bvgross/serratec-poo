package modelos;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String placa) {
        super(placa);
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String exibirTipo(){
        return "carro";
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo=" + exibirTipo() + "Número de portas: " + numeroDePortas + "]";
    }

}
