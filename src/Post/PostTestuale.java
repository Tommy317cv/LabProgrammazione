package Post;

import Utente.Utente;

import java.util.Date;

/**
 * Creazione di una sottoclasse di 'Post': 'PostTestuale'.
 * ..
 * La classe 'PostTestuale' è un'estensione della classe 'Post' che non aggiunge ulteriori metodi e attributi.
 */

public class PostTestuale extends Post {

    //Costruttore

    public PostTestuale(String idpost, Date datapubblicazione, String testodescrittivo, Utente utentecreatore) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
    }
    //Metodi

    @Override
    public int calcolaDimensionesPost() {
        return super.calcolaDimensionesPost();
    }
}
