import Post.Post;
import Utente.Utente;

public class MyApp {

    private Utente[]utentiCreati;
    private Post[] postPresenti;

    private int NextPos = 0;

    public void login (String nicknameUtente, String passwordUtente){};

    public void logout () {};

    public boolean utenteGiaPresente (Utente nuovoUtente) {return false;}


    public void addUtente (Utente UtenteDaIscrivere){

        for (Utente UtenteIesimo:utentiCreati){
            if(UtenteIesimo.equals(UtenteDaIscrivere)){
                System.out.println("Errore univocità nickname");
            }
            else{
                if (NextPos < utentiCreati.length){
                    utentiCreati[NextPos]=UtenteIesimo;
                    NextPos++;
                }
            }
        }





    }

    public static void main(String[] args) {




    }



}


