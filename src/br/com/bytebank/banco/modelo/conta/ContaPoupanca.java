package br.com.bytebank.banco.modelo.conta;

public class ContaPoupanca extends Conta implements Tributavel{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void saca(double valor) {
        double ValorASacar = valor + 7.00;
        super.saca(valor);
    }

    @Override
    public double getImposto() {
        return super.getSaldo() * 7.00;
    }
}
