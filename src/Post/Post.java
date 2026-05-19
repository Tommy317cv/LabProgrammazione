package Post;

import ClassiAppoggio.Notifica;
import Utente.Utente;

import java.util.Date;

/**
 * Aggiunta di un post da parte di un utente all'interno di 'Supsibook'.
 * .
 * La classe 'Post' permette di creare nuovi post con le variabili: idpost, datapubblicazione e testodescrittivo;
 * e che implementa i seguenti metodi: aggiungiLike, rimuoviLike, calcolaDimensioneTesto, calcolaDimensionePost,
 * creaNotifica.
 * Questa è una classe astratta che dunque  non è istanziabile ma permette l'estensione dei suoi attributi e
 * dei suoi metodi alle diverse sottoclassi.
 * 'Post' ha due relazioni con la classe 'Utente': un utente può creare zero o più post,
 * zero o più utenti possono mettere like a zero o più post.
 * 'Post' ha una relazione con la classe 'Notifica': un post può avere zero o più notifiche.
 */


public abstract class Post {
    private final String IDPOST;
    private final Date dataPubblicazione;
    private final String testoDescrittivo;
    private int dimensionetotale = 0;

    //Relazioni

    private Utente UtenteCreatore;
    private Notifica[] notificaRiferimento;
    private Utente[] listaLike;
    //Costruttore

    public Post(String idpost, Date datapubblicazione, String testodescrittivo, Utente utentecreatore) {
        this.IDPOST = idpost;
        this.dataPubblicazione = datapubblicazione;
        this.testoDescrittivo = testodescrittivo;
        this.UtenteCreatore = utentecreatore;
    }

    //Getter

    public String getTestodescrittivo() {
        return testoDescrittivo;
    }

    public String getIDPOST() {
        return IDPOST;
    }

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public String getTestoDescrittivo() {
        return testoDescrittivo;
    }

    public Utente[] getListaLike() {
        return listaLike;
    }

    public Utente getUtente() {
        return null;
    }

    public int getDimensionetotale() {
        return dimensionetotale;
    }

    //Metodi

    public void aggiungiLike(Utente Utente_Messo_Like) {
    }

    public void rimuoviLike(Utente Utente_Rimuovi_Like) {
    }


    public int calcolaDimensionesPost() {
        dimensionetotale = dimensionetotale + getTestoDescrittivo().length();
        return dimensionetotale;
    }

    public Notifica creaNotifica() {
        return null;
    }

}

