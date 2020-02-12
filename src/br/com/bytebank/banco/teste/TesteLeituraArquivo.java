package br.com.bytebank.banco.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class TesteLeituraArquivo {
    public static void main(String[] args) throws IOException{
        //inputStream -> leitura de bytes
        //Reader -> leitura de caracteres

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        System.out.println(bis.readLine());

        bis.close();
    }
}