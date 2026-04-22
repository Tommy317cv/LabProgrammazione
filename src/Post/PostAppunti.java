package Post;

import Interface.Votabile;
import Interface.pubblicaEvento;
import Utente.Studente;

import java.time.LocalDate;

public class PostAppunti extends PostDocumentale implements Votabile, pubblicaEvento{

    private Studente[] utentiAbilitatiVisualizzare;

    public PostAppunti(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione, Studente[] utentiAbilitatiVisualizzare) {
        super(idpost, datapubblicazione, testodescrittivo, idalfanumerico, dimensionetesto, dimensionetitolo, dimensionecitazione);
        this.utentiAbilitatiVisualizzare = utentiAbilitatiVisualizzare;
    }

    //Getter

    public Studente[] getUtentiAbilitatiVisualizzare() {
        return utentiAbilitatiVisualizzare;
    }

    @Override
    public Evento creaEvento() {
        return null;
    }

    @Override
    public void addVoto(double voto) {

    }

    @Override
    public double mediaVoti() {
        return 0;
    }
}

