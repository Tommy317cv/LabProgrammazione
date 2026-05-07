package Utente;
import Post.Post;
import ClassiAppoggio.Notifica;


/**
 * Creazione di un generico utente all'interno di 'Supsibook'.
 * .
 * La classe Utente permette di generare nuovi utenti, i quali hanno come variabili
 * personali: nickname, password e email.
 * Essendo una classe astratta non è istanziabile ma permette l'estensione dei suoi attributi e
 * dei suoi metodi alle diverse sottoclassi.
 * 'Utente' ha due relazioni con la classe 'Post': un utente può creare zero o più post,
 * zero o più utenti possono mettere like a zero o più post.
 * 'Utente' ha una relazione con la classe 'Notifica': un utente può inviare zero o più notifiche.
 * 'Utente ha una relazione con la clesse 'Evento': zero o più utenti possono essere invitati a zero o un evento.
 * Infine presenta anche una relazione con se stesso: zero o più utenti seguono zero o più altri utenti.
 */
public abstract class Utente {
    //Variabili di classe

    private final String NICKNAME;
    private String password;
    private String email;



    //Relazioni

    private Post [] PostUtente;
    private Utente[] listaFollowers;
    private Utente[] listaSeguiti;
    private Notifica [] NotificheUtente;
    private Post[] PostMessoLike;
    private boolean InvitatoEvento;
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
