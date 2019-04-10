package br.com.digitalhouse;

public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(Cliente novocliente, double taxaJuros) {
        super(novocliente);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public String recolherJuros(Conta conta) {
        double valor = (conta.getSaldo() * taxaJuros) - conta.getSaldo();
        System.out.println("Seu saque é de:" + valor);
        return "ok";
    }

    @Override
    public String depositarDinheiro(Conta conta, float valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Novo saldo é:" + conta.getSaldo());
        return "ok";
    }

    @Override
    public String sacar(Conta conta, float valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
            return "ok";
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Novo saldo é:" + conta.getSaldo());
            return "ok";
        }

    }
}
