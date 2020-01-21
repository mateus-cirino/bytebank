package _funcionario;

public class TesteControlaBonificacao {
    public static void main(String[] args) {
        ControlaBonificacao controle = new ControlaBonificacao();
        Gerente gerente = new Gerente();
        gerente.setSalario(1000.0);
        controle.registra(gerente);
        System.out.println(controle.getSoma());
    }
}
