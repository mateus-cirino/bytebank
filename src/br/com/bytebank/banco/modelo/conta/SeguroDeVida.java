package br.com.bytebank.banco.modelo.conta;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getImposto() {
        return 500.0;
    }
}
