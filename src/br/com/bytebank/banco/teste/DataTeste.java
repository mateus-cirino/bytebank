package br.com.bytebank.banco.teste;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataTeste {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFormacao = LocalDate.of(2020, Month.DECEMBER, 20);

        LocalTime dataLocal = LocalTime.of(15,30);

        Period periodo = Period.between(dataAtual, dataFormacao);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dataAtual.format(formatter));
    }
}
