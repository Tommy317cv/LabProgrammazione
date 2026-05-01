package Utente;

import ClassiAppoggio.Corso;

/**
 * Creazione di una sottoclasse di 'Utente': 'Docente'.
 * .
 * La classe 'Docente' è un'estensione della classe 'Utente',
 * non aggiunge altri attributi oltre quelli acquisiti dalla classe madre.
 * 'Docente' ha una relazione con la classe 'Corso', un docente può insegnare in zero o più corsi.
 */
public class Docente extends Utente {


    //Relazioni

    private Corso[] CorsiInsegnati;

    //Costruttore

    public Docente(String nickname, String password, String email) {
        super(nickname, password, email);
    }
}
