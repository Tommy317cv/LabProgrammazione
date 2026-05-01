package ClassiAppoggio;

import Utente.Docente;
import Utente.DocenteRicercatore;
import Utente.Studente;

 /*
 * Creazione di un generico corso di laurea.
 * ..
 * La classe 'Corso' permette di creare nuovi corsi con la variabile: nomeCorso;
 * senza implementare alcun metodo.
 * 'Corso' ha tre relazioni con le seguenti classi: 'Studente', 'Docente' e 'DocenteRicercatore', uno o più
 * studenti possono partecipare a zero o più, zero o un docentericercatore può insegnare in zero o più corsi,
 * un docente può insegnare in zero o più corsi.
 */


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
