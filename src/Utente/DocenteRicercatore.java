package Utente;

import ClassiAppoggio.Corso;

/**
 *Creazione di una sottoclasse di 'Ricercatore': 'DocenteRicercatore'.
 * .
 * La classe 'DocenteRicercatore' è un'estensione della classe 'Ricercatore' che a sua volta è un'estensione
 * della classe 'Utente', non aggiunge anche altri attributi.
 * La classe 'DocenteRicercatore' ha una relazione con la classe 'Corso', zero o un DocenteRicercatore può insegnare
 * in zero o più Corsi.
 */
public class DocenteRicercatore extends Ricercatore {

    //Relazione

    private Corso[] CorsiInsegnati;


    //Costruttore

    public DocenteRicercatore(String nickname, String password, String email, int hIndex, String parolaChiave) {
        super(nickname, password, email, hIndex, parolaChiave);
    }
}
