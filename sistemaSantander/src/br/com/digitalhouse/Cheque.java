package br.com.digitalhouse;

public class Cheque {
    private float valor;
    private String dataPagamento;
    private String bancoEmissor;

    public Cheque(float valor, String dataPagamento, String bancoEmissor) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.bancoEmissor = bancoEmissor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }
}
