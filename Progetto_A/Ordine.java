package Progetto_A;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private List<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto p) {
        prodotti.add(p);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Prodotto p : prodotti) {
            totale += p.getPrezzo();
        }
        return totale;
    }

    public void pagaOrdine(MetodoPagamento metodo) {
        double totale = calcolaTotale();
        metodo.paga(totale);
    }

}
