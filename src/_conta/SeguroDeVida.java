package _conta;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getImposto() {
        return 500.0;
    }
}
