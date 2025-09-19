package Progetto_A;

public class CartaDiCredito implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + "€ con Carta di Credito.");
    }
}
