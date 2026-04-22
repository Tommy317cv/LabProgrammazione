package Post;

import Interface.Taggabile;

import java.time.LocalDate;

public class PubblicazioneScientifica extends PostDocumentale implements Taggabile {
    private PubblicazioneScientifica[] altreCitazioni;

    //Costruttore

    public PubblicazioneScientifica(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione, PubblicazioneScientifica[] altreCitazioni) {
        super(idpost, datapubblicazione, testodescrittivo, idalfanumerico, dimensionetesto, dimensionetitolo, dimensionecitazione);
        this.altreCitazioni = altreCitazioni;
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
