package br.com.digitalhouse;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroA;

        System.out.println("Será descoberto se o numero é impar e maior que dez");
        System.out.println("Digite o primeiro numero:");
        numeroA = ler.nextInt();

        System.out.println(numeroA > 10 && numeroA%2==1);
    }
}
