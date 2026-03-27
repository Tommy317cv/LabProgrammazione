package Utente;

public class Studente extends Utente {

    private String CorsoLaurea;

    public Studente(String nickname, String password, String email, String corsoLaurea) {
        super(nickname, password, email);
        CorsoLaurea = corsoLaurea;
    }
}
