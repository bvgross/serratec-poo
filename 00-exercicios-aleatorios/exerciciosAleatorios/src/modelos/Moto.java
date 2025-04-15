package modelos;

public class Moto extends Veiculo{
    private boolean temBagageiro;

    public Moto(String placa) {
        super(placa);
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    public String exibirTipo(){
        return "moto";
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo=" + exibirTipo() + "Bagageiro: " + temBagageiro + "]";
    }
    
}