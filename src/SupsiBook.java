import Post.Post;
import Utente.Utente;

// Ex MyApp class


public class SupsiBook {

    private Utente[] utentiRegistrati = new Utente[100];
    private Post[] postPresenti;

    private int NextPos = 0;

    public void login(String nicknameUtente, String passwordUtente) {
    }

    ;

    public void logout() {
    }

    ;

    public boolean utenteGiaPresente(Utente nuovoUtente) {
        return false;
    }


    public void Registrazione(Utente utenteDaIscrivere) {
//Verifico la password
        if (!utenteDaIscrivere.verficaPassword()) {
            return;
        }

        // Controlla se l'utente è già presente
        for (int i = 0; i < NextPos; i++) {
            if (utentiRegistrati[i].equals(utenteDaIscrivere)) {
                System.out.println("ERR: Nickname '" + utenteDaIscrivere.getNICKNAME() + "' non disponibile");
                return;
            }
        }

        // Se non è presente, lo aggiunge
        if (NextPos < utentiRegistrati.length) {
            utentiRegistrati[NextPos] = utenteDaIscrivere;
            NextPos++;
            System.out.println(utenteDaIscrivere + "' aggiunto ");
        } else {
            System.out.println("Array pieno");
        }
    }
}




