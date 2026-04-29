package ClassiAppoggio;

import Utente.Docente;
import Utente.DocenteRicercatore;
import Utente.Studente;

public class Corso {

    private String nomeCorso;

   //Relazioni

    private Docente DocentePerCorso; //Per relazione
    private DocenteRicercatore DocenteRicercatorePerCorso; //Per relazione
    private Studente[] StudentiChePartecipaAlCorso;
    //Costruttore

    public Corso(String nomeCorso, Docente docentePerCorso, DocenteRicercatore docenteRicercatorePerCorso) {
        this.nomeCorso = nomeCorso;
        DocentePerCorso = docentePerCorso;
        DocenteRicercatorePerCorso = docenteRicercatorePerCorso;
    }


    //Getter

    public String getNomeCorso() {
        return nomeCorso;
    }


}
