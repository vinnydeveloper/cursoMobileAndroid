package br.com.digitalhouse;

public abstract class Conta {
    private float saldo;
    private  Cliente cliente;

    public Conta(Cliente novocliente){
        cliente =  novocliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract  String sacar(Conta conta, float valor);
    public abstract  String depositarDinheiro(Conta conta, float valor);
    public float consultarSaldo(Conta conta){
        return saldo;
    }
}
