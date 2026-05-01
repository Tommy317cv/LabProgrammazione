package Post;

import Utente.Utente;

import java.time.LocalDate;

/**
 * Creazione di una sottoclasse di 'Post': 'PostTestuale'.
 * ..
 * La classe 'PostTestuale' è un'estensione della classe 'Post' che non aggiunge ulteriori metodi e attributi.
 */

public class PostTestuale extends Post {

    //Costruttore

    public PostTestuale(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
    }


    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
