package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiadeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0;
        umaCadeiadeTexto = "Cadeia de texto do Vinicius";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiadeTexto);

        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Diferença de A + B = " + (umNumeroA - umNumeroB));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita alguma coisa ai peon:");
        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " + umNumeroA);

    }
}
