package br.com.digitalhouse;

public class Corrente extends Conta {
    private double saldoEspecial;

    public Corrente(Cliente novocliente, float saldoEspecial) {
        super(novocliente);
        this.saldoEspecial = saldoEspecial;
    }

    public String depositarCheque(Conta conta, Cheque cheque) {
        conta.setSaldo(conta.getSaldo() + cheque.getValor());
        System.out.println("Novo saldo é:" + conta.getSaldo());
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
        if (conta.getSaldo() < valor && (saldoEspecial >= valor)){
            saldoEspecial = saldoEspecial - valor;
            System.out.println("Você utilizou" + valor + "Do seu saldo especial");
            return "ok";
        }else if(conta.getSaldo() < valor && saldoEspecial < valor){
            System.out.println("Saldo insuficiente");
            return "ok";
        }else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Novo saldo é:" + conta.getSaldo());
            return "ok";
        }
    }
}
