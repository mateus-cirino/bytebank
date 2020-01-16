package _funcionario;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente mateus = new Gerente();
        mateus.setNome("Mateus");
        mateus.setCpf("0000000");
        mateus.setSalario(100);
        mateus.setSenha(0);
        System.out.println(mateus.autentica(1));
    }
}
