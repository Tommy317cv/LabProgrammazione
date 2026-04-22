package Utente;

import ClassiAppoggio.Corso;

public class Docente extends Utente {


    //Relazioni

    private Corso[] CorsiInsegnati;

    //Costruttore

    public Docente(String nickname, String password, String email) {
        super(nickname, password, email);
    }
}
