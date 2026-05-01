package Negozio;

import java.time.LocalDate;

public class Alimentare extends Prodotto{
    private LocalDate dataScadenza;

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public Alimentare(String CODICEBARRE, String descrizione, double prezzo, LocalDate dataScadenza) {
        super(CODICEBARRE, descrizione, prezzo);
        this.dataScadenza = dataScadenza;

        @Override
        public void applicaSconto;() {
            if (dataScadenza.equals(LocalDate.now())) {
                double nuovoPrezzo = getPrezzo() * 0.80;
                setPrezzo(nuovoPrezzo);
            } else {
                super.applicaSconto();
            }
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
}
