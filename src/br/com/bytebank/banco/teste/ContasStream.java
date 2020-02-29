package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.banco.Banco;
import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

public class ContasStream {
    public static void main(String[] args) {
        Banco banco = new Banco("bytebank");

        Cliente mateus = new Cliente("mateus", "0808080",
                "desenvolvedor");
        Cliente felipe = new Cliente("felipe", "2138080",
                "desenvolvedor");
        Cliente maria = new Cliente("maria", "4138080",
                "professora");


        Conta c1 = new ContaCorrente(1, 2, mateus);
        Conta c2 = new ContaCorrente(2, 3, felipe);
        Conta c3 = new ContaCorrente(3, 4, maria);

        c1.deposita(2000.0);
        c2.deposita(6000.0);
        c1.deposita(500.0);

        banco.adicionaConta(c1);
        banco.adicionaConta(c2);
        banco.adicionaConta(c3);


        Cliente mateus2 = new Cliente("mateus gente boa", "21308080",
                "desenvolvedor");
        Conta c4 = new ContaCorrente(10, 23, mateus2);
        banco.adicionaConta(c4);

        System.out.println("----------------------------------");

        banco.todasContas().stream()
                .filter(conta -> conta.getTitular().getProfissao().equals("desenvolvedor"))
                .map(Conta::getTitular)
                .filter(cliente -> cliente.getNome().contains("mateus"))
                .forEach(System.out::println);

        Double sum = banco.todasContas().stream()
                .filter(conta -> conta.getTitular().getProfissao().equals("desenvolvedor"))
                .mapToDouble(Conta::getSaldo)
                .sum();

        System.out.println(sum);
    }
}
