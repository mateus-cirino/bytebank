package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.SaldoInsuficienteException;

public class TesteException {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1);
        contaCorrente.deposita(100.0);
        try {
            contaCorrente.saca(300.0);
        }catch (SaldoInsuficienteException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        System.out.println("fim do main");
    }

}
