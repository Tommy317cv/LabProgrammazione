package Post;

import java.time.LocalDate;

public class PostDocumentale extends Post {
    private String idalfanumerico;
    private int dimensionetesto;
    private int dimensionetitolo;
    private int dimensionecitazione;

    public PostDocumentale(LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione) {
        super(datapubblicazione, testodescrittivo);
        this.idalfanumerico = idalfanumerico;
        this.dimensionetesto = dimensionetesto;
        this.dimensionetitolo = dimensionetitolo;
        this.dimensionecitazione = dimensionecitazione;
    }

}
