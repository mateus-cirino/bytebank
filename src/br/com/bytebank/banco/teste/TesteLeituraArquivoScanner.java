package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraArquivoScanner {
    public static void main(String[] args) throws FileNotFoundException {
        List<Conta> lista = new ArrayList<Conta>();

        Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()) {
            Scanner scanner_linha = new Scanner(scanner.nextLine());
            scanner_linha.useLocale(Locale.US);
            scanner_linha.useDelimiter(",");

            String tipoConta = scanner_linha.next();
            Integer numeroConta = scanner_linha.nextInt();
            Integer agenciaConta = scanner_linha.nextInt();
            String nomeTitularConta = scanner_linha.next();
            Double saldoConta = scanner_linha.nextDouble();

            if(tipoConta == "CC") { //se for conta corrente
                Conta conta = new ContaCorrente(numeroConta, agenciaConta);
                Cliente cliente = new Cliente();
                cliente.setNome(nomeTitularConta);
                conta.setTitular(cliente);
                conta.deposita(saldoConta);

                lista.add(conta);
            } else {                //então é uma conta poupanca
                Conta conta = new ContaPoupanca(numeroConta, agenciaConta);
                Cliente cliente = new Cliente();
                cliente.setNome(nomeTitularConta);
                conta.setTitular(cliente);
                conta.deposita(saldoConta);

                lista.add(conta);
            }
            scanner_linha.close();
        }
    scanner.close();
    lista.stream().forEach(conta -> System.out.println(conta)); //utilizando streams ao inves de for
    }
}
