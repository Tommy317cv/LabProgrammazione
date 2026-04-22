package Post;

import java.time.LocalDate;

public class PostDocumentale extends Post {
    private String idAlfanumerico;
    private int dimensionePDF;
    private int dimensioneTitolo;
    private int dimensioneCitazione;

    //Costruttore

    public PostDocumentale(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionePDF, int dimensioneTitolo, int dimensioneCitazione) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.idAlfanumerico = idalfanumerico;
        this.dimensionePDF = dimensionePDF;
        this.dimensioneTitolo = dimensioneTitolo;
        this.dimensioneCitazione = dimensioneCitazione;
    }

    //Getter

    public String getIdAlfanumerico() {return idAlfanumerico;}

    public int getDimensionePDF() {return dimensionePDF;}

    public int getDimensioneTitolo() {return dimensioneTitolo;}

    public int getDimensioneCitazione() {return dimensioneCitazione;}

    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}
