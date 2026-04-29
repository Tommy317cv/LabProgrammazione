package Post;

import Utente.Utente;

import java.time.LocalDate;

public class PostDocumentale extends Post {
    private String idAlfanumerico;
    private String Titolo;
    private String Citazione;
    private int dimensionePDF;

    //Costruttore

    public PostDocumentale(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico, String Titolo, String Citazione, int dimensionePDF) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
        this.idAlfanumerico = idAlfanumerico;
        this.Titolo = Titolo;
        this.Citazione = Citazione;
        this.dimensionePDF = dimensionePDF;
    }

    //Getter

    public String getIdAlfanumerico() {return idAlfanumerico;}
    public String getTitolo() {return Titolo;}
    public String getCitazione() {return Citazione;}
    public int getDimensionePDF() {return dimensionePDF;}

    //Setter

    public void setDimensionePDF(int dimensionePDF) {this.dimensionePDF = dimensionePDF;}
    public void setCitazione(String citazione) {Citazione = citazione;}
    public void setTitolo(String titolo) {Titolo = titolo;}
    public void setIdAlfanumerico(String idAlfanumerico) {this.idAlfanumerico = idAlfanumerico;}


    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }
}


