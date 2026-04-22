package Utente;

public class Ricercatore extends Utente {

    private int hIndex;
    private String paroleChiave;

    //Costruttore

    public Ricercatore(String nickname, String password, String email, int hIndex, String paroleChiave) {
        super(nickname, password, email);
        this.hIndex = hIndex;
        paroleChiave = paroleChiave;
    }

    //Getter

    public int gethIndex() {
        return hIndex;
    }

    public String getparolaChiave() {
        return paroleChiave;
    }

    //Setter

    public void sethIndex(int hIndex) {
        this.hIndex = hIndex;
    }

    public void setparolaChiave(String parolaChiave) {
        paroleChiave = parolaChiave;
    }
}
