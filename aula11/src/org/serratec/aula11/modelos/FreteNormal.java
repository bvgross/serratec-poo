package org.serratec.aula11.modelos;

public class FreteNormal implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        return peso * 10;
    }
}
