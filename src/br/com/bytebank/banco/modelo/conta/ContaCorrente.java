package br.com.bytebank.banco.modelo.conta;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void saca(double valor) {
        double ValorASacar = valor + 0.2;
        super.saca(valor);
    }

    @Override
    public double getImposto() {
        return super.getSaldo() * 0.1;
    }
}
