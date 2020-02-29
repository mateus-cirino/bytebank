package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class TesteLambdaMethodReference {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("mateus", "080812",
                "desenvolvedor");
        Cliente c2 = new Cliente("felipe", "230812",
                "designer");
        Cliente c3 = new Cliente("maria", "123812",
                "professora");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        clientes.sort(Comparator.comparing(cliente -> cliente.getCpf()));

        //methods references (quando é necessario só de 1 metodo)
        //metodo getCpf
        clientes.sort(Comparator.comparing(Cliente::getCpf));
        //metodo println
        clientes.forEach(System.out::println);

        //eh igual a

        //interface funcional
        Function<Cliente, Integer> funcaoComparacaoTamnahoCpf = cliente -> cliente.getCpf().length();

        //criando um objeto através de uma funcao do proprio objeto [padrao factory]
        //padrao factory permite retornar um objeto a partir de uma funcao do proprio objeto
        //no caso a funcao comparing retorna um Comparator
        Comparator<Cliente> comparador = Comparator.comparing(funcaoComparacaoTamnahoCpf);

        //ordenando atraves do comparator
        clientes.sort(comparador);

        System.out.println(clientes);
    }
}
