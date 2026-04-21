package Post;

import ClassiAppoggio.Notifica;
import Utente.Utente;

import java.time.LocalDate;

public abstract class Post{
    private final String IDPOST;
    private final LocalDate dataPubblicazione;
    private String testoDescrittivo;
    private Utente Utente; //Per collegamento con utenti
    private Utente[] listaLike;


    public Post(String idpost, LocalDate dataPubblicazione, String testoDescrittivo) {
        this.IDPOST = idpost;
        this.dataPubblicazione = dataPubblicazione;
        this.testoDescrittivo = testoDescrittivo;
    }

    public String getIDPOST() {
        return IDPOST;
    }

    public void setTestodescrittivo(String testodescrittivo) {
        this.testoDescrittivo = testodescrittivo;
    }

    public String getTestodescrittivo() {
        return testoDescrittivo;
    }

    public void aggiungiLike(Utente Utente_Ha_Messo_Like)  {}
    public void rimuoviLike(Utente Utente_Tolto_Like)  {}
    public Notifica creaNotifica() {return null;}

    public int CalcolaDimensioneTesto()
    {
        return 0;
    }

    abstract int calcolaDimensionesPost();


}

