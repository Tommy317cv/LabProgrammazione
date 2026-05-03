package Interface;


import Post.Evento;

/**
 * L'interefaccia 'pubblicaEvento' rappresenta un meccanismo per la pubblicazione di eventi.
 * Questa interfaccia definisce i metodi per la loro pubblicazione.
 * Ha come metodo: creaEvento, e può essere implementato solo dagli 'Influence'
 */
public interface pubblicaEvento {

public Evento creaEvento();

}
