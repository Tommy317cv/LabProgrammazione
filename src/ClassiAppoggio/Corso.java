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

    public Corso(String nomeCorso, Docente docentePerCorso, DocenteRicercatore docenteRicercatorePerCorso, Studente Studente1) {
        this.nomeCorso = nomeCorso;
        this.DocentePerCorso = docentePerCorso;
        this.DocenteRicercatorePerCorso = docenteRicercatorePerCorso;
        Studente1 = StudentiChePartecipaAlCorso[0];
    }


    //Getter

    public String getNomeCorso() {
        return nomeCorso;
    }


}
