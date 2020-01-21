package _funcionario;

public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil util;

    public Gerente () {
        this.util = new AutenticacaoUtil();
    }

    public double getBonificacao () { //reescrita do método getBonificacao da classe superior
        return super.getSalario(); //super referencia a classe superior
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

    @Override
    public int getSenha() {
        return this.util.getSenha();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }
}
