package br.com.digitalhouse;

public class principal {
    public static void main(String[] args) {
        Cachorro cachorro =  new Cachorro("Bidu", "20","Vira-Lata");
        System.out.println("Esse cachorro é mamifero?" + cachorro.ehMamifero());

        //Animal animal = new Animal("1m","Dog");

    }
}
