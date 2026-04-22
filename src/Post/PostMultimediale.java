package Post;

import Interface.Taggabile;

import java.time.LocalDate;

public class PostMultimediale extends Post implements Taggabile {
    private String linkVideo;

    public PostMultimediale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String linkVideo) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.linkVideo = linkVideo;
    }

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
