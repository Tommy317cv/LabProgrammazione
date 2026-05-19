package Post;

import Interface.Taggabile;
import Utente.Utente;

import java.util.Date;

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
    private int dimensionetotale = 0;

    //Costruttore
    public PubblicazioneScientifica(String idpost, Date datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico,  String Titolo, String Citazione, int dimensionePDF, int NumeroPubblicazioniScientifiche) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore, idAlfanumerico, Titolo, dimensionePDF);
        this.altreCitazioni = new PubblicazioneScientifica[NumeroPubblicazioniScientifiche];
    }

    //Getter

    public PubblicazioneScientifica[] getAltrecitazioni() {
        return altreCitazioni;
    }
    public PubblicazioneScientifica[] getAltreCitazioni() {return altreCitazioni;}

    @Override
    public int getDimensionetotale() {return dimensionetotale;}

    //Setter

    public void setAltrecitazioni(PubblicazioneScientifica[] altreCitazioni) {this.altreCitazioni = altreCitazioni;}

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

     @Override
     public int calcolaDimensionesPost() {
         for (int i = 0; i < this.altreCitazioni.length; i++) {
             dimensionetotale = super.calcolaDimensionesPost() + this.altreCitazioni[i].calcolaDimensionesPost();
         }
         return super.calcolaDimensionesPost();
     }
 }

