package Utente;

import ClassiAppoggio.Corso;
import Interface.pubblicaPostAppunti;
import Post.PostAppunti;

/**
 * Creazione di una sottoclasse di 'Utente': 'Studente'.
 * .
 * La classe 'Studente' è un'estensione della classe 'Utente' ma oltre agli attributi acquisiti,
 * aggiunge anche l'attributo: corsoLaurea.
 * 'Studente' ha una relazione con la classe 'Corso', uno o più studenti possono partecipare a zero o più corsi;
 * presenta anche un collegamento con la classe 'PostAppunti', zero o più studenti possono
 * visualizzare zero o più post.
 * 'Studente' implementa un'interfaccia 'pubblicaPostAppunti', prendendo i suoi metodi.
 */
public class Studente extends Utente implements pubblicaPostAppunti {

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

    @Override
    public PostAppunti creaAppunti() {
        return null;
    }

    @Override
    public PostAppunti visualizzaAppunti() {
        return null;
    }
}
