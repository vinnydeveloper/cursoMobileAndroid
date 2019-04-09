package br.com.digitalhouse;

public abstract class Animal {
    private String tamanho;
    private String raca;

    public Animal(){
        
    }
    public Animal(String novoTamanho, String novoRaca) {
        tamanho = novoTamanho;
        raca = novoRaca;
    }

    public String getRaca() {
        return raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setRaca(String raca) {
        raca = raca;
    }

    public void setTamanho(String tamanho) {
        tamanho = tamanho;
    }

    public abstract boolean ehMamifero();
}
