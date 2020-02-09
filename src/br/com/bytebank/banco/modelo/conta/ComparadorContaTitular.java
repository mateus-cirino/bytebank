package br.com.bytebank.banco.modelo.conta;

import java.util.Comparator;

public class ComparadorContaTitular implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
        Conta conta1 = (Conta) o1;
        Conta conta2 = (Conta) o2;
        return conta1.getTitular().getNome().compareTo(conta2.getTitular().getNome());
	}

}