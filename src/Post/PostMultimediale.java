package Post;

import Interface.Taggabile;

import java.time.LocalDate;

public class PostMultimediale extends Post implements Taggabile {
    private String linkVideo;

    //Costruttore

    public PostMultimediale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String linkVideo) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.linkVideo = linkVideo;
    }

    //Getter
    public String getLinkVideo() {return linkVideo;}

    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
