package br.com.bytebank.banco.modelo.funcionario;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica (Autenticavel aut){ //recebe uma classe que tenha um contrato com a interface Autenticavel
        if(aut.autentica(this.senha)){
            System.out.println("entrou no sistema");
        }
    }
}
