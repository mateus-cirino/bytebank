package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.banco.Banco;
import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

import java.util.Optional;
import java.util.stream.Collectors;

public class MaisStreams {
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
        c1.deposita(500.0);

        banco.adicionaConta(c1);
        banco.adicionaConta(c2);
        banco.adicionaConta(c3);
        //o tipo optional eh muito interessante para não termos, por exemplo
        //verificar se o elemento eh null, entre outras coisas
        Optional<Conta> conta = banco.todasContas().stream()
                .findAny();

        conta.ifPresent(System.out::println);

        //ou podemos fazer diretamente na stream
        banco.todasContas().stream()
                .findAny()
                .ifPresent(System.out::println);
    }
}
