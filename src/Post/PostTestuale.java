package Post;

import Utente.Utente;

import java.time.LocalDate;

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
