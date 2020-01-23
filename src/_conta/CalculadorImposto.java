package _conta;

public class CalculadorImposto {
    static double total_imposto;

    public static void soma_imposto (Tributavel tri) {
        total_imposto += tri.getImposto();
    }
}
