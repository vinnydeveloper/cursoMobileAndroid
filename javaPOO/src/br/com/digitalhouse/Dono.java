package br.com.digitalhouse;

public class Dono {
    private String nome;
    private String sexo;


    //construtor
    public Dono(String newNome) {
        nome = newNome;
    }

    public Dono() {

    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void alimentar(Cachorro cachorro) {
        System.out.println("Olá " + cachorro.nome);
    }
}
