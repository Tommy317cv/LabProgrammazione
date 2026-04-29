package Utente;

/**
 * Creazione di una sottoclasse di 'Utente': 'Riceractore'.
 * .
 * La classe 'Ricercatore' è un'estensione della classe 'Utente' ma oltre agli attributi acquisiti,
 * aggiunge anche gli attributi: hIndex e paroleChiave; e il metodo: addParolaChiave.
 * La classe 'Ricercatore' permette l'estensione dei suoi attributi e dei suoi metodi alle diverse
 * sottoclassi: Influecer e DocenteRicercatore.
 */
public class Ricercatore extends Utente {

    private int hIndex;
    private String paroleChiave;

    //Costruttore

    public Ricercatore(String nickname, String password, String email, int hIndex, String paroleChiave) {
        super(nickname, password, email);
        this.hIndex = hIndex;
        this.paroleChiave = paroleChiave;
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

    // Metodi

    public String addParolaChiave(String parolaChiave) {
        return parolaChiave;
    }

}
