package br.com.digitalhouse.aeroporto;

public class Pato implements Voador {
    private int energia;

    @Override
    public void voar() {
        energia-=5;
        if (energia <= 0){
            System.out.println("Estou muito cansado, e não consigo voar");
        }else {
            System.out.println("Estou voando como um pato");
        }
    }
}
