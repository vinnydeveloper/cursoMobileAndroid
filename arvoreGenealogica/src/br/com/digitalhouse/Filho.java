package br.com.digitalhouse;

public class Filho {
    private String nome;
    private String mae;
    private String pai;

    public Filho(String newNome, String newMae, String newPai){
        mae = newMae;
        pai = newPai;
        nome = newNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }


}
