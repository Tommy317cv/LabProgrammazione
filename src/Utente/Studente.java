package Utente;

import ClassiAppoggio.Corso;
import Post.PostAppunti;

public class Studente extends Utente {

    private String corsoLaurea;

    //Relazione

    private Corso[] CorsiSeguiti;
    private PostAppunti[] VisualizzaPostAppunti;


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
}
