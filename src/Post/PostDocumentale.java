package Post;

import Utente.Utente;

import java.time.LocalDate;

/**
 * Creazione di una sottoclasse di 'Post': 'PostDocumentale'.
 * ..
 * La classe 'PostDocumentale' è un'estensione della classe 'Post' ma oltre agli attributi acquisiti,
 * aggiunge anche gli attributi: hidAlfanumerico, dimensionePdf, titolo e citazioni; e il metodo: addCitazione.
 * La classe 'PostDocumentale' permette l'estensione dei suoi attributi e dei suoi metodi alle diverse
 * sottoclassi: PubblicazioneScientifica e PostAppunti.
 * La classe 'PostDocumentale' ha una relazione con se stessa, un 'PostDocumentale' può citare zero o più altri 'PostDocumentali'.
 */



public class PostDocumentale extends Post {
    private String idAlfanumerico;
    private String Titolo;
    private PostDocumentale [] Citazioni;
    private int dimensionePDF;

    //Costruttore

    public PostDocumentale(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico, String Titolo, int dimensionePDF) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
        this.idAlfanumerico = idAlfanumerico;
        this.Titolo = Titolo;
        this.dimensionePDF = dimensionePDF;
    }

    //Getter

    public String getIdAlfanumerico() {return idAlfanumerico;}
    public String getTitolo() {return Titolo;}
    public int getDimensionePDF() {return dimensionePDF;}



    //Setter

    public void setDimensionePDF(int dimensionePDF) {this.dimensionePDF = dimensionePDF;}
    public void setTitolo(String titolo) {Titolo = titolo;}
    public void setIdAlfanumerico(String idAlfanumerico) {this.idAlfanumerico = idAlfanumerico;}



    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }

    public void addCitazione(PostDocumentale CitazioneDaAggiugnere) {}

}

