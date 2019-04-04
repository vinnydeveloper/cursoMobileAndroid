package br.com.digitalhouse;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeroA = new int[3];
        int resultado = 0;
        System.out.println("Será somado 3 numeros passados");
        System.out.println("Digite primeiro numero:");
        numeroA[0] = ler.nextInt();
        System.out.println("Digite segundo numero:");
        numeroA[1] = ler.nextInt();
        System.out.println("Digite terceiro numero:");
        numeroA[2] = ler.nextInt();

        for(int a: numeroA){
            resultado+= a;
        }



        System.out.println("O resultado é: "+ resultado);
    }
}
