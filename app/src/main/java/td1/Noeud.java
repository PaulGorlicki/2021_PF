package td1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud <T extends Sommable<T>> implements Arbre <T> {
    private List <Arbre<T>> enfants;

    public Noeud(final List<Arbre<T>> enfants) {
        this.enfants = enfants;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre a : enfants) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(T val) {
        boolean rtr = false;
        for (final Arbre a : enfants) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : enfants) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        if (enfants == null || enfants.size() == 0) {
            return null;
        }
        else {
            T v = enfants.get(0).somme();
            int i;
            for (i = 1; i<enfants.size(); i++) {
                v = v.sommer(enfants.get(i).somme());
            }
            return v;
        }
    }

    @Override
    public T min() {
        if (enfants == null || enfants.size() == 0) {
            return null;
        }
        else {
            T v = enfants.get(0).min();
            int i;
            for (i = 1; i<enfants.size(); i++) {
                v = v.sommer(enfants.get(i).min());
                T min = enfants.get(i).min();
                //if (min.compareTo(v)==1) {
                //    v = min;
                //}
            }
            return v;
        }
    }

    @Override
    public T max() {
        if (enfants == null || enfants.size() == 0) {
            return null;
        }
        else {
            T v = enfants.get(0).max();
            int i;
            for (i = 1; i<enfants.size(); i++) {
                v = v.sommer(enfants.get(i).max());
                T max = enfants.get(i).max();
                //if (v.compareTo(max)==1) {
                //   v = max;
                //}
            }
            return v;
        }
    }

    @Override
    public boolean estTrie() {
        return false;
    }
/* A changer dans les prochains exo => classe sommable
    @Override
    public T somme() {
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        int rtr = 0;
        for (Arbre a : fils) {
            rtr += a.somme();
        }
        return rtr;
    }

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        int rtr = fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            int min = fils.get(i).min();
            if (min < rtr) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public Integer max() {
        if (fils == null || fils.size() == 0)
            return null;
        int rtr = fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            int max = fils.get(i).max();
            if (max > rtr) {
                rtr = max;
            }
        }
        return rtr;
    }
*/
    /**
     * un noeud de fils f1 ... fi ... fn est trié ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est trié</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */
/*
    @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fj = fils.get(i+1);
            if (fi.max() > fj.min())
                return false;
        }
        return rtr;
    }*/
}