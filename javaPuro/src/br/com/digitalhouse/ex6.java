package br.com.digitalhouse;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeroA = new int[3];
        int resultado = 0;
        System.out.println("Será exibidos somente numeros pares passados:");
        for (int i = 0; i < numeroA.length; i++) {
            System.out.println("Digite algum numero =");
            numeroA[i] = ler.nextInt();
        }
        exibirPares(numeroA);

    }

    public static void exibirPares(int[] numero) {
        System.out.println("Esses são os numeros pares:");
        for (int a : numero) {
            if (a % 2 == 0) {
                System.out.println(a);
            }

        }
    }
}
