package Utente;

import ClassiAppoggio.Corso;
import Post.Post;
import Post.PostAppunti;
import Post.Evento;

/**
 * Creazione di una sottoclasse di 'Utente': 'Studente'.
 * .
 * La classe 'Studente' è un'estensione della classe 'Utente' ma oltre agli attributi acquisiti,
 * aggiunge anche l'attributo: corsoLaurea.
 * 'Studente' ha una relazione con la classe 'Corso', uno o più studenti possono partecipare a zero o più corsi;
 * presenta anche un collegamento con la classe 'PostAppunti', zero o più studenti possono
 * visualizzare zero o più postAppunti.
 * 'Studente' implementa un'interfaccia 'pubblicaPostAppunti', prendendo i suoi metodi.
 */

public class Studente extends Utente {

    private String corsoLaurea;

    //Relazione

    private Corso[] CorsiSeguiti;


    //Costruttore

    public Studente(String nickname, String password, String email, String corsoLaurea) {
        super(nickname, password, email);
        this.corsoLaurea = corsoLaurea;
    }

    //Getter

    public String getcorsoLaurea() {
        return corsoLaurea;
    }

    //Setter

    public void setcorsoLaurea(String corsoLaurea) {
        this.corsoLaurea = corsoLaurea;
    }

    public void setCorsiSeguiti(Corso[] corsiSeguiti) {
        CorsiSeguiti = corsiSeguiti;
    }

    //Metodi

    //Modifica del metodo puoPubblicare per permettere di pubblicare Posti di appunti ma non Eventi

    @Override
    protected boolean puoPubblicare(Post TipologiaPost) {
        return !(TipologiaPost instanceof Evento);
    }


    //Metodo toString

    @Override
    public String toString() {
        return "Studente '" + getNICKNAME();
    }

}



