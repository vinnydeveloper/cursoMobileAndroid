package br.com.digitalhouse;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroA,numeroB;

        System.out.println("Será comparado dois numero e dizer se o primeiro é menor");
        System.out.println("Digite o primeiro numero:");
        numeroA = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        numeroB = ler.nextInt();

        System.out.println(numeroA < numeroB);

    }
}
