package Post;

import ClassiAppoggio.Notifica;
import Utente.Utente;

import java.time.LocalDate;

 /*
 * Aggiunta di un post da parte di un utente all'interno di 'Supsibook'.
 * ..
 * La classe 'Post' permette di creare nuovi post con le variabili: idpost, datapubblicazione e testodescrittivo;
 * e che implementa i seguenti metodi: aggiungiLike, rimuoviLike, calcolaDimensioneTesto, calcolaDimensionePost,
 * creaNotifica.
 * Questa è una classe astratta che dunque  non è istanziabile ma permette l'estensione dei suoi attributi e
 * dei suoi metodi alle diverse sottoclassi.
 */


public abstract class Post{
    private final String IDPOST;
    private final LocalDate dataPubblicazione;
    private String testoDescrittivo;


    //Relazioni

    private Utente UtenteCreatore; //per relazione
    private Notifica [] notificaRiferimento; //per relazione
    private Utente[] listaLike;
    //Costruttore

    public Post(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore) {
        this.IDPOST = idpost;
        this.dataPubblicazione = datapubblicazione;
        this.testoDescrittivo = testodescrittivo;
        this.UtenteCreatore = utentecreatore;
    }

    //Getter

    public String getTestodescrittivo() {
        return testoDescrittivo;
    }

    public String getIDPOST() {return IDPOST;}

    public LocalDate getDataPubblicazione() {return dataPubblicazione;}

    public String getTestoDescrittivo() {return testoDescrittivo;}

    public Utente[] getListaLike() {return listaLike;}

    public Utente getUtente() {return null;}

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

