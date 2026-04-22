package Utente;

import ClassiAppoggio.Corso;

public class DocenteRicercatore extends Ricercatore {

    //Relazione

    private Corso[] CorsiInsegnati;


    //Costruttore

    public DocenteRicercatore(String nickname, String password, String email, int hIndex, String parolaChiave) {
        super(nickname, password, email, hIndex, parolaChiave);
    }
}
