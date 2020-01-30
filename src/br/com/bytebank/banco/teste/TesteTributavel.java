package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.CalculadorImposto;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.SeguroDeVida;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1,1);
        contaCorrente.deposita(200.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.soma_imposto(contaCorrente);

        CalculadorImposto.soma_imposto(seguroDeVida);
        System.out.println(calculadorImposto.total_imposto);
    }
}
