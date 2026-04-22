package Post;

import Interface.Votabile;
import Utente.Utente;

import java.time.LocalDate;

public class Evento extends Post implements Votabile {
    private LocalDate dataEvento;
    private String luogoEvento;
    private String descrizioneEvento;
    private Utente[] listaInvitati;

    public Evento(String idpost, LocalDate datapubblicazione, String testodescrittivo, LocalDate dataevento, String luogoEvento, String descrizioneevento) {
        super(idpost, datapubblicazione, testodescrittivo);
        this.dataEvento = dataevento;
        this.luogoEvento = luogoEvento;
        this.descrizioneEvento = descrizioneevento;

    }

    //Getter

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public String getLuogoEvento() {
        return luogoEvento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    //Setter

    public void setListaInvitati(Utente[] listaInvitati) {
        this.listaInvitati = listaInvitati;
    }


    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }

}
