package Utente;

import Post.Evento;

/**
 *Creazione di una sottoclasse di 'Ricercatore': 'Influencer'.
 * .
 * La classe 'Influencer' è un'estensione della classe 'Ricercatore' che a sua volta è un'estensione
 * della classe 'Utente', aggiunge anche un attributo: suntaBlu.
 * La classe 'Influencer' implementa un'interfaccia 'pubblicaEvento', prendendo i suoi metodi.
 */
public class Influencer extends Ricercatore{


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

}
