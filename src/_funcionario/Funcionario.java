package _funcionario;

public abstract class Funcionario { //classes abstratas servem para herança e quando  nao queremos que exista um objeto desta classe
    private String nome;
    private String cpf;
    private double salario; //publico para (somente) os filhos

    public abstract double getBonificacao (); //metodos abstratos sao metodos sem comportamento na classe mae, porem obriga os filhos a implementarem um comportamento

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
