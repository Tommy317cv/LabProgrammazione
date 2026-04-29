package Post;

import Interface.Taggabile;
import Utente.Utente;

import java.time.LocalDate;

public class PubblicazioneScientifica extends PostDocumentale implements Taggabile {
    private PubblicazioneScientifica[] altreCitazioni;

    //Costruttore
    public PubblicazioneScientifica(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, String idAlfanumerico,  String Titolo, String Citazione, int dimensionePDF, int NumeroPubblicazioniScientifiche) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore, idAlfanumerico, Titolo, Citazione, dimensionePDF);
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
