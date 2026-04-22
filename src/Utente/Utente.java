package Utente;
import Post.Post;

import ClassiAppoggio.Notifica;

public class Utente {
    //Variabili di classe
    private final String NICKNAME;
    private String password;
    private String email;
    private Post[] PostPubblicati;
    private Utente[] listaFollowers;
    private Utente[] listaSeguiti;


    public Utente(String nickname, String password, String email) {
        this.NICKNAME = nickname;
        this.password = password;
        this.email = email;
    }

    public void seguireUtente(Utente Utente_Da_Seguire) {}

    public void smettiSeguireUtente(Utente Utente_Smetti_Seguire) {}

    public void aggiungiFollower(Utente Follower) {}

    public void rimuoviFollower(Utente Follower_Rim) {}

    public boolean notificaVisualizzata(Notifica Visualizzata ){return false;}
}
