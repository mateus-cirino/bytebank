package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

import java.util.HashSet;
import java.util.Set;

public class TesteContaSet {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(1, 2);
        Conta c2 = new ContaCorrente(2, 3);
        Conta c3 = new ContaCorrente(3, 4);
        Conta c4 = new ContaCorrente(4, 5);
        Conta c5 = new ContaCorrente(5, 6);

        Set<Conta> contas = new HashSet<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);

        Conta novaC1 = new ContaCorrente(1, 2);
        
        System.out.println(contas.contains(novaC1));
    }
}
