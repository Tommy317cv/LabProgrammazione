package Post;

import Utente.Utente;

import java.time.LocalDate;

public class Evento extends Post {
    private LocalDate dataevento;
    private String luogoevento;
    private String descrizioneevento;
    private Utente[] listainvitati;

    public Evento(String idpost, LocalDate datapubblicazione, String testodescrittivo, LocalDate dataevento, String luogoevento, String descrizioneevento) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.dataevento = dataevento;
        this.luogoevento = luogoevento;
        this.descrizioneevento = descrizioneevento;

    }

    public void setDataevento(LocalDate dataevento) {
        this.dataevento = dataevento;
    }

    public void setLuogoevento(String luogoevento) {
        this.luogoevento = luogoevento;
    }

    public void setDescrizioneevento(String descrizioneevento) {
        this.descrizioneevento = descrizioneevento;
    }

    public void setListainvitati(Utente[] listainvitati) {
        this.listainvitati = listainvitati;
    }

    @Override
    int calcolaDimensionesTesto() {
        return 0;
    }

}
