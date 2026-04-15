package Utente;

public class Influencer extends Utente {


    private boolean SpuntaBlu;

    public Influencer(String nickname, String password, String email) {
        super(nickname, password, email);
    }

    public void setSpuntaBlu(boolean spuntaBlu) {
        SpuntaBlu = spuntaBlu;
    }

    public boolean isSpuntaBlu() {
        boolean spuntaBlu = SpuntaBlu;
        return spuntaBlu;
    }
}
