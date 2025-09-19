package SistemaPagamenti;

public class Bonifico implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + "€ con Bonifico.");
    }
}

