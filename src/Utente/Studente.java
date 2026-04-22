package Utente;

public class Studente extends Utente{

    private String CorsoLaurea;

    public Studente(String nickname, String password, String email, String corsoLaurea) {
        super(nickname, password, email);
        CorsoLaurea = corsoLaurea;
    }

    public String getCorsoLaurea() {
        return CorsoLaurea;
    }

    public void setCorsoLaurea(String corsoLaurea) {
        CorsoLaurea = corsoLaurea;
    }
}
