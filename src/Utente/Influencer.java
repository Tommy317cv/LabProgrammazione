package Utente;

import Interface.pubblicaEvento;
import Post.Evento;

public class Influencer extends Ricercatore implements pubblicaEvento {


    private boolean spuntaBlu;

    //Costruttore

    public Influencer(String nickname, String password, String email, int hIndex, String parolaChiave, boolean spuntaBlu) {
        super(nickname, password, email, hIndex, parolaChiave);
        this.spuntaBlu = spuntaBlu;
    }

    //Getter

    public boolean isSpuntaBlu() {return spuntaBlu;}

    //Setter

    public void setspuntaBlu(boolean spuntaBlu) {
        this.spuntaBlu = spuntaBlu;
    }

    //Metodi

    public boolean isspuntaBlu() {
        boolean spuntaBlu = this.spuntaBlu;
        return spuntaBlu;
    }

    @Override
    public Evento creaEvento() {
        return null;
    }
}
