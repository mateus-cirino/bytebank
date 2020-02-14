package br.com.bytebank.banco.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Properties;

public class TesteProperties {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
/*        properties.setProperty("login", "mateus");
        properties.setProperty("senha", "password");
        properties.setProperty("porta", "22");

        properties.store(
                new FileWriter("properties.txt"),
                "arquivo de configuração");*/

        properties.load(new FileReader("properties.txt"));

        System.out.println(
                String.format(Locale.US,"Login: %s%nSenha: %s%nPorta: %s",
                        properties.get("login"),
                        properties.get("senha"),
                        properties.get("porta"))
        );
    }
}
