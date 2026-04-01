package Post;

import java.time.LocalDate;

public class PubblicazioneScientifica extends PostDocumentale {
    private PubblicazioneScientifica[] altrecitazioni;

    public PubblicazioneScientifica(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione, PubblicazioneScientifica[] altrecitazioni) {
        super(idpost, datapubblicazione, testodescrittivo, idalfanumerico, dimensionetesto, dimensionetitolo, dimensionecitazione);
        this.altrecitazioni = altrecitazioni;
    }

    public void setAltrecitazioni(PubblicazioneScientifica[] altrecitazioni) {
        this.altrecitazioni = altrecitazioni;
    }

    public PubblicazioneScientifica[] getAltrecitazioni() {
        return altrecitazioni;
    }


}
