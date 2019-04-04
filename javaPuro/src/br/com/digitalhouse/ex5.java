package br.com.digitalhouse;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeroA = new int[3];
        System.out.println("Será somado numeros pares passados:");
        for (int i = 0; i < numeroA.length; i++) {
            System.out.println("Digite algum numero =");
            numeroA[i] = ler.nextInt();
        }
        System.out.println(somarPares(numeroA));

    }

    public static String somarPares(int[] numero){
        int resultado = 0;
        for(int a: numero){
            if(a%2==0){
                resultado+= a;
            }
        }
       return ("O resultado é: "+ resultado);
    }
}
