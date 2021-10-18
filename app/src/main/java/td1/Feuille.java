package td1;

import java.util.Set;

public class Feuille <T> implements Arbre <T> {

    private T valeur;

    public Feuille(T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(T val) {
        if (val == valeur) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public T somme() {
        return valeur;
    }

    @Override
    public T min() {
        return valeur;
    }

    @Override
    public T max() {
        return valeur;
    }

    public String toString() {
        return "Feuille : " + valeur;
    }

    /**
     * une feuille est toujours triée.
     */
    @Override
    public boolean estTrie() {
        return true;
    }

}