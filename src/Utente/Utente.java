package Utente;
import Post.Post;

public class Utente {
    //Variabili di classe
    private final String nickname;
    private String password;
    private String email;
    private Post[] PostDel_Utente;


    public Utente(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }


}
