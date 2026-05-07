package Post;

import Interface.Votabile;
import Interface.pubblicaEvento;
import Utente.Studente;
import Utente.Utente;

import java.time.LocalDate;

 /**
 * Creazione di una sottoclasse di 'PostDocumentale': 'PostAppunti'.
 * ..
 * La classe 'PostAppunti' è un'estensione della classe 'PostDocumentale' che a sua volta è un'estensione
 * della classe 'Post'; ma oltre agli attributi acquisiti, aggiunge anche l'attributo: utentiAbilitatiVisualizzare.
 * Questa classe ha un collegamento con la classe 'Studenti', zero o più post possono
 * visualizzare zero o più studenti .
 * 'PostAppunti' implementa l'interfaccia 'Votabile', prendendo i suoi metodi.
 */


public class PostAppunti extends PostDocumentale implements Votabile, pubblicaEvento{

    private Studente[] utentiAbilitatiVisualizzare;

    //Costruttore

    public PostAppunti(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico, String Titolo, String Citazione, int dimensionePDF, int NumeroUtentiAbilitatiVisualizzare) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore, idAlfanumerico, Titolo, dimensionePDF);
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

