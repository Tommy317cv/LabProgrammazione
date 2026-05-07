package ClassiAppoggio;

import Post.Post;
import Utente.Utente;

/**
 * Creazione di una generica notifica.
 * ..
 * La classe 'Notifica' permette di creare notifiche con la variabile: notificaVista; implementando
 * il metodo: segnaVisualizzata.
 * 'Notifica' ha due relazioni con le seguenti classi: 'Post' e 'Utente', un post può avere zero o più
 * notifiche e una notifica può essere inviata a zero o più utenti.
 */


public class Notifica {

    private boolean notificaVista;

    //Relazioni

    private Post postRiferimento;
    private Utente utenteACuiInviare;

    //Costruttore

    public Notifica(boolean notificaVista, Post postRiferimento, Utente utenteACuiInviare) {
        this.notificaVista = notificaVista;
        this.postRiferimento = postRiferimento;
        this.utenteACuiInviare = utenteACuiInviare;
    }

   //Getter

    public Post getPostRiferimento() {
        return postRiferimento;
    }
    public boolean isNotificaVista() {
        return notificaVista;
    }
    //Metodi

    public void segnaVisualizzata() {}

}

