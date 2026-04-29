package Post;

import Interface.Votabile;
import Interface.pubblicaEvento;
import Utente.Studente;
import Utente.Utente;

import java.time.LocalDate;

public class PostAppunti extends PostDocumentale implements Votabile, pubblicaEvento{

    private Studente[] utentiAbilitatiVisualizzare;

    //Costruttore

    public PostAppunti(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico, String Titolo, String Citazione, int dimensionePDF, int NumeroUtentiAbilitatiVisualizzare) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore, idAlfanumerico, Titolo, Citazione, dimensionePDF);
        this.utentiAbilitatiVisualizzare = new Studente[NumeroUtentiAbilitatiVisualizzare];
    }


//Getter

    public Studente[] getUtentiAbilitatiVisualizzare() {
        return utentiAbilitatiVisualizzare;
    }

    //Metodi

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

