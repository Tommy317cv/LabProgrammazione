package Negozio;

import java.util.Objects;

public class Prodotto {
    private String CODICEBARRE;
    private String descrizione;
    private double prezzo;
//COSTRUTTORE
    public Prodotto(String CODICEBARRE, String descrizione, double prezzo) {
        this.CODICEBARRE = CODICEBARRE;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
//GETTER
    public String getCODICEBARRE() {
        return CODICEBARRE;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public void applicaSconto() {
        prezzo *= 0.95;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto)) return false;
        Prodotto p = (Prodotto) o;
        return CODICEBARRE.equals(p.CODICEBARRE);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + CODICEBARRE + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}

