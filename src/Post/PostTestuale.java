package Post;

import java.time.LocalDate;

public class PostTestuale extends Post {

    //Costruttore
    public PostTestuale(String idpost, LocalDate datapubblicazione, String testodescrittivo) {
        super(idpost, datapubblicazione, testodescrittivo);
    }

    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
