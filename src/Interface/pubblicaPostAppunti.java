package Interface;

import Post.PostAppunti;
/**
 * L'interefaccia 'pubblicaPostAppunti' rappresenta un meccanismo per la pubblicazione di appunti.
 * Questa interfaccia definisce i metodi per la loro pubblicazione.
 * Ha come metodi: creaAppunti e visualizzaAppunti; e può essere implementato solo dagli 'Studenti'.
 */
public interface pubblicaPostAppunti {

public PostAppunti creaAppunti();
public PostAppunti visualizzaAppunti();


}
