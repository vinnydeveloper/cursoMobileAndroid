package br.com.digitalhouse;

public class run {
    public static void main(String[] args) {
        Filho vinicius = new Filho("Vinicius", "Telma", "Joao");
        Filho davi = new Filho("Davi", "Telma", "Delivaldo");
        Filho jose = new Filho("Jose", "Maria", "Joao");

        System.out.println(vinicius.getNome() + " é meio-irmão de " + davi.getNome() + "? " + saoMeiosIrmaos(vinicius, davi));
        System.out.println(vinicius.getNome() + " é meio-irmão de " + jose.getNome() + "? " + saoMeiosIrmaos(vinicius, jose));
        System.out.println(davi.getNome() + " é meio-irmão de " + jose.getNome() + "? " + saoMeiosIrmaos(davi, jose));
    }

    //Criando metodos da lógica
    public static String maeDe(Filho filho) {
        return filho.getMae();
    }

    public static String paiDe(Filho filho) {
        return filho.getPai();
    }

    public static boolean temAMesmaMae(Filho filhoA, Filho filhoB) {
        return maeDe(filhoA).equals(maeDe(filhoB));
    }

    public static boolean temOMesmoPai(Filho filhoA, Filho filhoB) {
        return paiDe(filhoA).equals(paiDe(filhoB));
    }

    public static boolean saoMeiosIrmaos(Filho filhoA, Filho filhoB) {
        return temAMesmaMae(filhoA, filhoB) && !temOMesmoPai(filhoA, filhoB) || !temAMesmaMae(filhoA, filhoB) && temOMesmoPai(filhoA, filhoB);
    }
}
