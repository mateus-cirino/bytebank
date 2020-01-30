package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.funcionario.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente mateus = new Gerente();
        mateus.setNome("Mateus");
        mateus.setCpf("0000000");
        mateus.setSalario(100);
/*        mateus.setSenha(0);
        System.out.println(mateus.autentica(1));*/
    }
}
