package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.funcionario.Gerente;
import br.com.bytebank.banco.modelo.funcionario.SistemaInterno;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }
}
