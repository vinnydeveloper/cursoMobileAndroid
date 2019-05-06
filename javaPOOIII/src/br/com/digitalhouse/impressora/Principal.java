package br.com.digitalhouse.impressora;

public class Principal {
    public static void main(String[] args) {
        Imprimivel contrato = new Contrato("Locação da casa", "txt");
        Imprimivel foto = new Foto("Foto perfil", "jpg");
        Imprimivel documento = new Documento("Arquivo em Word", "docs");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();

    }

}
