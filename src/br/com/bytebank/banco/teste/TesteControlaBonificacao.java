package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.funcionario.ControlaBonificacao;
import br.com.bytebank.banco.modelo.funcionario.Gerente;

public class TesteControlaBonificacao {
    public static void main(String[] args) {
        ControlaBonificacao controle = new ControlaBonificacao();
        Gerente gerente = new Gerente();
        gerente.setSalario(1000.0);
        controle.registra(gerente);
        System.out.println(controle.getSoma());
    }
}
