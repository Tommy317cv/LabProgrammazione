package Post;

import ClassiAppoggio.Notifica;
import Utente.Utente;

import java.time.LocalDate;

public abstract class Post{
    private final String IDPOST;
    private final LocalDate dataPubblicazione;
    private String testoDescrittivo;
    private Utente[] listaLike;
    private Utente Utente;

    //Costruttore

    public Post(String idpost, LocalDate datapubblicazione, String testodescrittivo) {
        this.IDPOST = idpost;
        this.dataPubblicazione = datapubblicazione;
        this.testoDescrittivo = testodescrittivo;
    }

    //Getter

    public String getTestodescrittivo() {
        return testoDescrittivo;
    }

    public String getIDPOST() {return IDPOST;}

    public LocalDate getDataPubblicazione() {return dataPubblicazione;}

    public String getTestoDescrittivo() {return testoDescrittivo;}

    public Utente[] getListaLike() {return listaLike;}

    public Utente getUtente() {return Utente;}

    //Setter

    public void setTestodescrittivo(String testodescrittivo) {
        this.testoDescrittivo = testodescrittivo;
    }

    //Metodi

    public void aggiungiLike( Utente Utente_Messo_Like ) {}

    public void rimuoviLike(Utente Utente_Rimuovi_Like) {}

    public int calcolaDimensioneTesto()
    {
        return 0;
    }

    abstract int calcolaDimensionesPost();

    public Notifica creaNotifica() {return null;}

    public Utente[] listaUtenti_MiPiace ()
    {
        return null;
    }

}

