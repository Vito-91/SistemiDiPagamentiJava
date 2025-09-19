package Progetto_A;

public class Main {
    public static void main(String[] args) {
        Ordine ordine = new Ordine();
        ordine.aggiungiProdotto(new Prodotto("Torta", 20.0));
        ordine.aggiungiProdotto(new Prodotto("Caffè", 2.5));
        ordine.aggiungiProdotto(new Prodotto("Pane", 1.5));

        System.out.println("Totale ordine: " + ordine.calcolaTotale() + "€");

        ordine.pagaOrdine(new CartaDiCredito());
        ordine.pagaOrdine(new PayPal());
        ordine.pagaOrdine(new Bonifico());
    }
}
