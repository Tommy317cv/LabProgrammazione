package Post;

import Utente.Utente;

import java.time.LocalDate;

abstract class Post{
    private final String idpost;
    private final LocalDate datapubblicazione;
    private String testodescrittivo;

    public Post(String idpost, LocalDate datapubblicazione, String testodescrittivo) {
        this.idpost = idpost;
        this.datapubblicazione = datapubblicazione;
        this.testodescrittivo = testodescrittivo;
    }


    public void setTestodescrittivo(String testodescrittivo) {
        this.testodescrittivo = testodescrittivo;
    }

    public String getTestodescrittivo() {

        return testodescrittivo;
    }

    abstract int calcolaDimensionesTesto ();

    public Utente[] listaUtenti_MiPiace ()
    {
        return null;
    }

}

