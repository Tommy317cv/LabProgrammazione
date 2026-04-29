package Utente;

import ClassiAppoggio.Corso;

/**
 * Creazione di una sottoclasse di 'Ricercatore': 'DocenteRicercatore'.
 * .
 * La classe 'DocenteRicercatore' è un'estensione della classe 'Ricercatore' che a sua volta è un'estensione della classe 'Utente';
 * questa classe non aggiunge ulteriori metodi e attributi.
 * 'DocenteRicercatore'  ha una relazione con la classe 'Corso', zero o un docente ricercatore può insegnare in zero o più corsi.
 */
public class DocenteRicercatore extends Ricercatore {

    //Relazione

    private Corso[] CorsiInsegnati;


    //Costruttore

    public DocenteRicercatore(String nickname, String password, String email, int hIndex, String parolaChiave) {
        super(nickname, password, email, hIndex, parolaChiave);
    }
}
