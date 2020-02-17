package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));

        Conta conta = new ContaCorrente(1,2);
        Cliente cliente = new Cliente();

        cliente.setNome("Mateus");
        cliente.setCpf("0808080808");
        cliente.setProfissao("Programador");

        conta.setTitular(cliente);
        conta.deposita(200.0);

        oos.writeObject(conta);

        //outra conta

        Conta outraConta = new ContaCorrente(10,15);
        Cliente outroCliente = new Cliente();

        outroCliente.setNome("Mateus");
        outroCliente.setCpf("0808080808");
        outroCliente.setProfissao("Programador");

        outraConta.setTitular(cliente);
        outraConta.deposita(200.0);

        oos.writeObject(outraConta);
        oos.close();*/

        FileInputStream fis = new FileInputStream("conta.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(fis.available() > 0) {
            Conta contaLeitura = (Conta) ois.readObject();
            System.out.println(contaLeitura.getNumero());
        }

        ois.close();

    }
}
