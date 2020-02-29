package br.com.bytebank.banco.modelo.conta;

import java.io.Serializable;
import java.util.Objects;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
    private static final long serialVersionUID = 1L;

    protected double saldo; //visivel para os filhos (dentro do mesmo pacote)
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(Integer agencia, Integer numero, Cliente cliente){
        if(agencia.equals(null) || numero.equals(null)
        || cliente.equals(null)) {
            throw new NullPointerException("Nao se pode iniciar" +
                    "uma conta com valores nulos");
        }
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.titular = cliente;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public Conta(Integer agencia, Integer numero){
        if(agencia.equals(null) || numero.equals(null)) {
            throw new NullPointerException("Nao se pode iniciar" +
                    "uma conta com valores nulos");
        }
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor) ;
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, agencia, numero, titular);
    }

    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj;
        return (this.numero == conta.getNumero());
    }

    @Override
    public String toString() {
        return "O numero desta conta é: " + this.numero;
    }

    //ordem natural
    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }
}