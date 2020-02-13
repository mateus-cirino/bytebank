package br.com.bytebank.banco.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class TesteLeituraArquivo {
    public static void main(String[] args) throws IOException{
        //inputStream -> leitura de bytes
        //Reader -> leitura de caracteres

        //leitura do arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        //escrita do arquivo
        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bis.lines().forEach((str) -> {
            try {
                bw.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        //fechando o arquivo de leitura
        bis.close();

        //fechando o arquivo de escrita
        bw.close();
    }
}