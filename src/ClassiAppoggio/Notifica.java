package ClassiAppoggio;

import Post.Post;
import Utente.Utente;

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

