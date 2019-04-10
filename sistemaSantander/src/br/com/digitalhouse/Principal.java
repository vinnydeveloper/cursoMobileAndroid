package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente(1,"Oliveira","37.878.091-8","454.844.398-33");
        Corrente contaCorrente = new Corrente(vinicius,100);
        contaCorrente.depositarCheque(contaCorrente,new Cheque(1000,"10-10-2019","Bradesco"));
        contaCorrente.sacar(contaCorrente,100);
        contaCorrente.depositarDinheiro(contaCorrente, 200);
        contaCorrente.sacar(contaCorrente,1100);
        contaCorrente.sacar(contaCorrente,80);

        System.out.println("TESTE CONTA POUPANÇA");
        Poupanca contaPoupanca = new Poupanca(vinicius,2.3);
        contaPoupanca.depositarDinheiro(contaPoupanca,1000);
        contaPoupanca.sacar(contaPoupanca,500);
        contaPoupanca.recolherJuros(contaPoupanca);
    }
}
