package Post;

import java.time.LocalDate;

public class PostTestuale extends Post {
    public PostTestuale(String idpost, LocalDate datapubblicazione, String testodescrittivo) {
        super(idpost, datapubblicazione, testodescrittivo);
    }
    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
