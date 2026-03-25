import java.time.LocalDate;

public class Evento extends Post{
    private LocalDate dataevento;
    private String luogoevento;
    private String descrizioneevento;
    private Utente[] listainvitati;

    public Evento(LocalDate datapubblicazione, String testodescrittivo, Utente[] listainvitati, String descrizioneevento, String luogoevento, LocalDate dataevento) {
        super(datapubblicazione, testodescrittivo);
        this.listainvitati = listainvitati;
        this.descrizioneevento = descrizioneevento;
        this.luogoevento = luogoevento;
        this.dataevento = dataevento;
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
}
