package Utente;

public class Ricercatore extends Utente {

    private int hIndex;
    private String parolaChiave;

    public Ricercatore(String nickname, String password, String email, int hIndex, String parolaChiave) {
        super(nickname, password, email);
        this.hIndex = hIndex;
        ParolaChiave = parolaChiave;
    }

    public int gethIndex() {
        return hIndex;
    }

    public String getParolaChiave() {
        return ParolaChiave;
    }

    public void sethIndex(int hIndex) {
        this.hIndex = hIndex;
    }

    public void setParolaChiave(String parolaChiave) {
        ParolaChiave = parolaChiave;
    }
}
