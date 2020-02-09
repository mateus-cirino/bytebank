package br.com.bytebank.banco.modelo.conta;

import java.util.Comparator;

public class ComparadorContaTitular implements Comparator<Conta>{

	@Override
	public int compare(Conta conta1, Conta conta2) {
        return conta1.getTitular().getNome().compareTo(conta2.getTitular().getNome());
	}

}