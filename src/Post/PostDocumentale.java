package Post;

import Utente.Utente;

import java.util.Date;

/**
 * Creazione di una sottoclasse di 'Post': 'PostDocumentale'.
 * ..
 * La classe 'PostDocumentale' è un'estensione della classe 'Post' ma oltre agli attributi acquisiti,
 * aggiunge anche gli attributi: hidAlfanumerico, dimensionePdf, titolo e citazioni; e il metodo: addCitazione.
 * La classe 'PostDocumentale' permette l'estensione dei suoi attributi e dei suoi metodi alle diverse
 * sottoclassi: PubblicazioneScientifica e PostAppunti.
 * La classe 'PostDocumentale' ha una relazione con se stessa, un 'PostDocumentale' può citare zero o più altri 'PostDocumentali'.
 */


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
    private final String idAlfanumerico;
    private final String Titolo;
    private PostDocumentale [] Citazioni;
    private final int dimensionePDF;
    private int dimensionetotale = 0;

    //Costruttore

    public PostDocumentale(String idpost, Date datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico, String Titolo, int dimensionePDF) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
        this.idAlfanumerico = idAlfanumerico;
        this.Titolo = Titolo;
        this.dimensionePDF = dimensionePDF;
    }

    //Getter

    public String getIdAlfanumerico() {return idAlfanumerico;}
    public String getTitolo() {return Titolo;}
    public int getDimensionePDF() {return dimensionePDF;}

    @Override
    public int getDimensionetotale() {return dimensionetotale;}

    //Metodi

    @Override
    public int calcolaDimensionesPost() {
        int dimensionetotale = super.calcolaDimensionesPost() +
                getIdAlfanumerico().length() + 
                getTitolo().length() + 
                getDimensionePDF();
        for (int i = 0; i < this.Citazioni.length; i++) {
            dimensionetotale = dimensionetotale + this.Citazioni[i].calcolaDimensionesPost();
        }
        return dimensionetotale; 
    }

    public void addCitazione(PostDocumentale CitazioneDaAggiugnere) {}

}

