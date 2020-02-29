package br.com.bytebank.banco.modelo.conta;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf, String profissao) {
        if(nome.equals(null) || cpf.equals(null) || profissao.equals(null)) {
            throw new NullPointerException("Nao se pode iniciar" +
                    "um cliente com valores nulos");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public Cliente () {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", profissao='" + this.profissao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(profissao, cliente.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, profissao);
    }
}
