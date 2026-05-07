package Post;

import Interface.Taggabile;
import Utente.Utente;

import java.time.LocalDate;

 /**
 * Creazione di una sottoclasse di 'PostDocumentale': 'PubblicazioneScientifica'.
 * ..
 * La classe 'PubblicazioneScientifica' è un'estensione della classe 'PostDocumentale' che a sua volta è un'estensione
 * della classe 'Post'; ma oltre agli attributi acquisiti, aggiunge anche l'attributo: altreCitazioni.
 * La classe 'PubblicazioneScientifica' ha una relazione con se stessa, una PubblicazioneScientifica può citare
 * zero o più altre 'PubblicazioneScientifiche'.
 * 'PubblicazioneScientifica' implementa un'interfaccia 'Taggabile', prendendo i suoi metodi.
 */


public class PubblicazioneScientifica extends PostDocumentale implements Taggabile {
    private PubblicazioneScientifica[] altreCitazioni;

    //Costruttore
    public PubblicazioneScientifica(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico,  String Titolo, String Citazione, int dimensionePDF, int NumeroPubblicazioniScientifiche) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore, idAlfanumerico, Titolo, dimensionePDF);
    this.altreCitazioni = new PubblicazioneScientifica[NumeroPubblicazioniScientifiche];
    }


    //Getter

    public PubblicazioneScientifica[] getAltrecitazioni() {
        return altreCitazioni;
    }

    public PubblicazioneScientifica[] getAltreCitazioni() {return altreCitazioni;}

    //Setter

    public void setAltrecitazioni(PubblicazioneScientifica[] altreCitazioni) {
        this.altreCitazioni = altreCitazioni;
    }

    //Metodi

    @Override
    public void addTag(String Tag) {

    }

    @Override
    public void removeTag(String Remove_Tag) {

    }

    @Override
    public void getTag() {

    }
}
