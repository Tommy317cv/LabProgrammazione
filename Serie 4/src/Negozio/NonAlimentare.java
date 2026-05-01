package Negozio;

public class NonAlimentare extends Prodotto{
    private String materiale;

    public String getMateriale() {
        return materiale;
    }

    public NonAlimentare(String CODICEBARRE, String descrizione, double prezzo, String materiale) {
        super(CODICEBARRE, descrizione, prezzo);
        this.materiale = materiale;
    }

    @Override
    public void applicaSconto() {
        if (materiale.equals("carta") || materiale.equals("vetro") || materiale.equals("plastica")) {
            double nuovoPrezzo = getPrezzo() * 0.90;
            setPrezzo(nuovoPrezzo);
        } else {
            super.applicaSconto();
        }
    }

    private double getPrezzo() {
        return 0;
    }

    private void setPrezzo(double prezzo) {
        try {
            java.lang.reflect.Field field = Prodotto.class.getDeclaredField("prezzo");
            field.setAccessible(true);
            field.set(this, prezzo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

