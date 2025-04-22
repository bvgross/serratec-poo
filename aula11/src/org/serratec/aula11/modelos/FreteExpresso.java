package org.serratec.aula11.modelos;

public class FreteExpresso implements CalculoFrete{
    @Override
    public double calcular(double peso) {
        return peso * 15 + 20;
    }
}
