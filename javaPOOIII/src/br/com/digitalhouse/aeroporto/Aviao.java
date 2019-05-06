package br.com.digitalhouse.aeroporto;

public class Aviao implements Voador {
    private int horasDeVoo;
    @Override
    public void voar() {
        horasDeVoo+=13;
        System.out.println("Estou voando como um avião");
    }
}
