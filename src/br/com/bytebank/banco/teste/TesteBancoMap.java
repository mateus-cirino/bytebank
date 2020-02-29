package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.banco.Banco;
import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

public class TesteBancoMap {
    public static void main(String[] args) {
        Banco banco = new Banco("bytebank");

        Cliente mateus = new Cliente("mateus", "0808080",
                "desenvolvedor");
        Cliente felipe = new Cliente("felipe", "2138080",
                "pintor");
        Cliente maria = new Cliente("maria", "4138080",
                "professora");


        Conta c1 = new ContaCorrente(1, 2, mateus);
        Conta c2 = new ContaCorrente(2, 3, felipe);
        Conta c3 = new ContaCorrente(3, 4, maria);


        banco.adicionaConta(c1);
        banco.adicionaConta(c2);
        banco.adicionaConta(c3);

        System.out.println("Qual é o cliente da conta C1");

        Cliente cliente = banco.clienteConta(c1);

        System.out.println(cliente);

        Conta c4 = new ContaCorrente(4, 4);

        cliente = banco.clienteConta(c4);

        System.out.println(cliente);
    }
}
