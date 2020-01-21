package _conta;

public class ContaCorrente extends Conta{
    public ContaCorrente (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public boolean saca(double valor) {
        double ValorASacar = valor + 0.2;
        return super.saca(valor);
    }
}
