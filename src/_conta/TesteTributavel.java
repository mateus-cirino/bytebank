package _conta;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1,1);
        contaCorrente.deposita(200.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.soma_imposto(contaCorrente);

        CalculadorImposto.soma_imposto(seguroDeVida);
        System.out.println(calculadorImposto.total_imposto);
    }
}
