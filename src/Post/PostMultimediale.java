package Post;

import java.time.LocalDate;

public class PostMultimediale extends Post {
    private String linkvideo;

    public PostMultimediale(LocalDate datapubblicazione, String testodescrittivo, String linkvideo) {
        super(datapubblicazione, testodescrittivo);
        this.linkvideo = linkvideo;
    }
}
