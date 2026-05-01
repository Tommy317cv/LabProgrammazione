package Post;

import Interface.Taggabile;
import Utente.Utente;

import java.time.LocalDate;

/*
 * Creazione di una sottoclasse di 'Post': 'PostMultimediale'.
 * ..
 * La classe 'PostMultimediale' è un'estensione della classe 'Post' e oltre agli attributi acquisiti, aggiunge
 * anche l'attributo: linkVideo.
 * 'PostMultimediale' implementa un'interfaccia 'Taggabile', prendendo il suo metodo.
 */


public class PostMultimediale extends Post implements Taggabile {
    private String linkVideo;

    //Costruttore


    public PostMultimediale(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String linkVideo) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
        this.linkVideo = linkVideo;
    }

    //Getter
    public String getLinkVideo() {return linkVideo;}

    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }

    @Override
    public void addTag(String Tag) {

    }

    @Override
    public void removeTag(String Remove_Tag) {

    }

    @Override
    public void getTag() {

    }
}
