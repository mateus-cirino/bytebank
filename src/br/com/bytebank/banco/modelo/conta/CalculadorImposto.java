package br.com.bytebank.banco.modelo.conta;

public class CalculadorImposto {
    public static double total_imposto;

    public static void soma_imposto (Tributavel tri) {
        total_imposto += tri.getImposto();
    }
}
