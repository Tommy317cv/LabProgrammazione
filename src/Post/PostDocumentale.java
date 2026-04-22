package Post;

import java.time.LocalDate;

public class PostDocumentale extends Post {
    private String idAlfanumerico;
    private int dimensionetesto;
    private int dimensioneTitolo;
    private int dimensioneCitazione;
    private int dimensionePDF;

    public PostDocumentale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.idAlfanumerico = idalfanumerico;
        this.dimensionePDF = dimensionePDF;
        this.dimensioneTitolo = dimensioneTitolo;
        this.dimensioneCitazione = dimensioneCitazione;
    }

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
