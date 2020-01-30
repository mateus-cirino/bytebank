package br.com.bytebank.banco.modelo.conta;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super();
    }

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
