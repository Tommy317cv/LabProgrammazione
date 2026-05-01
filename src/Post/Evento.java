package Post;

import Interface.Votabile;
import Utente.Utente;

import java.time.LocalDate;

/**
 * Creazione di una sottoclasse di 'Post': 'Evento'.
 * ..
 * La classe 'Evento' è un'estensione della classe 'Post' e oltre agli attributi acquisiti, aggiunge
 * anche gli attributi: dataEvento, luogoEvento, descrizioneEvento e listaInvitati; e un metodo: addInvitati.
 * Questa classe ha una relazione con la classe 'Utente', zero o più eventi possono avere
 * zero o più utenti come invitati.
 * 'Evento' implementa l'interfaccia 'Votabile'; prendendo i loro metodi.
 */

public class Evento extends Post implements Votabile {
    private LocalDate dataEvento;
    private String luogoEvento;
    private String descrizioneEvento;
    private Utente[] listaInvitati;

    //Costruttore

    public Evento(String idpost, LocalDate datapubblicazione, String testodescrittivo, Utente utentecreatore, LocalDate dataevento, String luogoEvento, String descrizioneevento, int NumerolistaInvitati) {
        super(idpost, datapubblicazione, testodescrittivo, utentecreatore);
        this.dataEvento = dataevento;
        this.luogoEvento = luogoEvento;
        this.descrizioneEvento = descrizioneevento;
        this.listaInvitati = new Utente[NumerolistaInvitati];

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

    public Utente[] getListaInvitati() {return listaInvitati;}
    //Setter

    public void setListaInvitati(Utente[] listaInvitati) {
        this.listaInvitati = listaInvitati;
    }


    //Metodi

    @Override
    int calcolaDimensionesPost() {
        return 0;
    }

    @Override
    public void addVoto(double voto) {

    }

    @Override
    public double mediaVoti() {
        return 0;
    }
}
