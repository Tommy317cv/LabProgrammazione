package ClassiAppoggio;

import Post.Post;

public class Notifica {

    private boolean notificaVista;
    private Post postRiferimento;

    //Costruttore

    public Notifica(boolean notificaVista, Post postRiferimento) {
        this.notificaVista = notificaVista;
        this.postRiferimento = postRiferimento;
    }

   //Getter

    public Post getPostRiferimento() {
        return postRiferimento;
    }

    //Metodi

    public void segnaVisualizzata() {}
    public boolean isNotificaVista() {
        return notificaVista;
    }
}

