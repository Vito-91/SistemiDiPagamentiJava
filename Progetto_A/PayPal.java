package Progetto_A;

public class PayPal implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + "€ con PayPal.");
    }
}
