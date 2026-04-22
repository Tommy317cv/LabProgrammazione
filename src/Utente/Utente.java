package Utente;
import Post.Post;
import ClassiAppoggio.Notifica;



public abstract class Utente {
    //Variabili di classe
    private final String NICKNAME;
    private String password;
    private String email;

    private Utente[] listaFollowers;
    private Utente[] listaSeguiti;

    //Costruttore

    public Utente(String nickname, String password, String email) {
        this.NICKNAME = nickname;
        this.password = password;
        this.email = email;
    }

    //Getter

    public String getNICKNAME() {return NICKNAME;}

    public String getPassword() {return password;}

    public String getEmail() {return email;}

    public Post[] getPostPubblicati() {return null;}

    public Utente[] getListaFollowers() {return null;}

    public Utente[] getListaSeguiti() {return null;}

    //Metodi

    public void seguireUtente(Utente Utente_Da_Seguire) {}

    public void smettiSeguireUtente(Utente Utente_Smetti_Seguire) {}

    public void aggiungiFollower(Utente Follower) {}

    public void rimuoviFollower(Utente Follower_Rim) {}

    public void addPost(Post Post_Da_Pubblicare) {}

    public boolean notificaVisualizzata(Notifica Visualizzata ){return false;}
}
