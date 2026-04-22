package Post;

import java.time.LocalDate;

public class PostDocumentale extends Post {
    private String idAlfanumerico;
    private int dimensionetesto;
    private int dimensionetitolo;
    private int dimensioneCitazione;

    public PostDocumentale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.idAlfanumerico = idalfanumerico;
        this.dimensionetesto = dimensionetesto;
        this.dimensionetitolo = dimensionetitolo;
        this.dimensioneCitazione = dimensionecitazione;
    }

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
