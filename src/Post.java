import java.time.LocalDate;

public class Post{
    private static final String idpost;
    private LocalDate datapubblicazione;
    private String testodescrittivo;

    public Post(LocalDate datapubblicazione, String testodescrittivo) {
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