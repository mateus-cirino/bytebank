package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.ComparadorContaTitular;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(1,1);
        Cliente cli1 = new Cliente();
        cli1.setNome("Mateus");
        conta1.setTitular(cli1);
        
        Conta conta2 = new ContaCorrente(1,1);
        Cliente cli2 = new Cliente();
        cli2.setNome("Java");
        conta2.setTitular(cli2); 

        Conta conta3 = new ContaCorrente(1,1);
        Cliente cli3 = new Cliente();
        cli3.setNome("Alberto");
        conta3.setTitular(cli3); 

        Conta conta4 = new ContaCorrente(1,1);
        Cliente cli4 = new Cliente();
        cli4.setNome("Alfredo");
        conta4.setTitular(cli4);
        
        List<Conta> lista_contas = new ArrayList<Conta>();
        
        lista_contas.add(conta1);
        lista_contas.add(conta2);
        lista_contas.add(conta3);
        lista_contas.add(conta4);

        for (Conta conta : lista_contas) {
            System.out.println(conta.getTitular().getNome());
        }

        lista_contas.sort(new ComparadorContaTitular());

        System.out.println("--------------------------------");

        for (Conta conta : lista_contas) {
            System.out.println(conta.getTitular().getNome());
        }
    }
}