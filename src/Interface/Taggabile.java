package Interface;

/**
 * L'interfaccia 'Taggabile' rappresenta un meccanismo per poter inserire dei tag nei post.
 * Questa interfaccia definisce i metodi per il funzionamento del meccanismo.
 * Ha come metodi: addTag, removeTag e getTag;
 * e può essere implementato solo da 'PubblicazioneScientifica' e 'PostMultimediale'.
 */
public interface Taggabile {


    public void addTag(String Tag);
    public void removeTag(String Remove_Tag);
    public void getTag();

}
