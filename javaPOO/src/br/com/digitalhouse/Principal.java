package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Dono vinicius = new Dono("Vinicius");
        Dono jessica = new Dono();
        vinicius.setNome("Vinicius de Oliveira");
        vinicius.setSexo("Masculino");
        System.out.println(vinicius.getNome() + " é do sexo:" + vinicius.getSexo());

        Cachorro bidu = new Cachorro("Bidu");
        vinicius.alimentar(bidu);

    }
}
