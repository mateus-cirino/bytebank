package _funcionario;

public class ControlaBonificacao {
    private double soma;

    public void registra (Funcionario funcionario) { //polimorfismo a mesma funcao 'registra' serve tanto para o
                                                     //funcionario quanto para o gerente.
                                                     //a funcao recebe a classe mais generica e consegue usar o método
                                                     //da classe mais especifica (mas tem que ser um método que a generica
                                                     //tambem possua
      this.soma += funcionario.getBonificacao();
    };

    public double getSoma() {
        return this.soma;
    }
}
