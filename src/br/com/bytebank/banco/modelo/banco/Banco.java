package br.com.bytebank.banco.modelo.banco;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;

import java.util.*;

public class Banco {
    private String nome;
    private Collection<Conta> conjuntoContas;
    private Map<Conta, Cliente> contaClienteMap;

    public Banco(String nome) {
        if(nome.equals(null)) {
            throw new NullPointerException("não é possível criar um banco" +
                    " com o nome nulo");
        }
        this.nome = nome;
        conjuntoContas = new HashSet<>();
        contaClienteMap = new HashMap<>();
    }

    public void adicionaConta(Conta conta) {
        this.conjuntoContas.add(conta);
        this.contaClienteMap.put(conta, conta.getTitular());
    }

    public Cliente clienteConta(Conta conta) {
        if(!contaClienteMap.containsKey(conta)) {
            throw new NoSuchElementException("nao tem essa conta no banco");
        }
        return this.contaClienteMap.get(conta);
    }
}
