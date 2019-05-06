package br.com.digitalhouse.impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private List<Imprimivel> imprimiveis = new ArrayList<>();

    public Impressora() {
    }

    public void imprimirTudo() {
//        for (int i = 0; i < imprimiveis.size(); i++) {
//            imprimiveis.get(i).imprimir();
//
//        }
        for (Imprimivel item: imprimiveis) {
            item.imprimir();
        }
        imprimiveis.removeAll(imprimiveis);
        System.out.println("Todos os itens da fila foram impressos. Fila Vazia");
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        imprimiveis.add(umImprimivel);
    }
}
