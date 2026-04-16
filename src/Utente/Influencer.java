package Utente;

public class Influencer extends Ricercatore {


    private boolean SpuntaBlu;

    public Influencer(String nickname, String password, String email, int hIndex, String parolaChiave, boolean spuntaBlu) {
        super(nickname, password, email, hIndex, parolaChiave);
        SpuntaBlu = spuntaBlu;
    }

    public void setSpuntaBlu(boolean spuntaBlu) {
        SpuntaBlu = spuntaBlu;
    }

    public boolean isSpuntaBlu() {
        boolean spuntaBlu = SpuntaBlu;
        return spuntaBlu;
    }
}
