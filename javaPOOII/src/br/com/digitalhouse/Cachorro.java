package br.com.digitalhouse;

public class Cachorro extends Animal {
    private String nome;
    public Cachorro(String novoNome, String novoTamanho, String novaRaca){
        super(novoTamanho,novaRaca);
        nome = novoNome;
    }

     @Override
    public boolean ehMamifero() {
        System.out.println("Printando se é mamifero");
        return true;
    }
}
