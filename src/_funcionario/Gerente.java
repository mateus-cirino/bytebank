package _funcionario;

public class Gerente extends Funcionario {
    private int senha;

    public double getBonificacao () { //reescrita do método getBonificacao da classe superior
        return super.getSalario(); //super referencia a classe superior
    }

    public boolean autentica (int senha) {
        return this.senha == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
