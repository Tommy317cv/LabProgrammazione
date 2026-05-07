package Interface;

/**
 * L'interfaccia 'Votabile' rappresenta un meccanismo per poter inserire dei voti e poter fare la media dei voti inseriti.
 * Questa interfaccia definisce i metodi per il funzionamento del meccanismo.
 * Ha come metodi: addVoto e mediaVoti;
 * e può essere implementato solo da 'PostAppunti' e 'Evento'.
 */
public interface Votabile {

public void addVoto(double voto);
public double mediaVoti();


}
