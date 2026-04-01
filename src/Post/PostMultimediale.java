package Post;

import java.time.LocalDate;

public class PostMultimediale extends Post {
    private String linkvideo;

    public PostMultimediale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String linkvideo) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.linkvideo = linkvideo;
    }

    @Override
    int calcolaDimensionesTesto() {
        return 0;
    }
}
