package Post;

import java.time.LocalDate;

public class Post{
    private final String idpost;
    private LocalDate datapubblicazione;
    private String testodescrittivo;

    public Post(String idpost, LocalDate datapubblicazione, String testodescrittivo) {
        this.idpost = idpost;
        this.datapubblicazione = datapubblicazione;
        this.testodescrittivo = testodescrittivo;
    }


    public void setTestodescrittivo(String testodescrittivo) {
        this.testodescrittivo = testodescrittivo;
    }

    public String getTestodescrittivo() {
        return testodescrittivo;
    }
}