package _funcionario;

public class TesteControlaBonificacao {
    public static void main(String[] args) {
        ControlaBonificacao controle = new ControlaBonificacao();
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000.0);
        Gerente gerente = new Gerente();
        gerente.setSalario(1000.0);
        controle.registra(funcionario);
        controle.registra(gerente);
        System.out.println(controle.getSoma());
    }
}
