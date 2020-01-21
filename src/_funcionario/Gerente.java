package _funcionario;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public double getBonificacao () { //reescrita do método getBonificacao da classe superior
        return super.getSalario(); //super referencia a classe superior
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
