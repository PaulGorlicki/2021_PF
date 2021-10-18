package td1;

import junit.framework.TestCase;

import java.util.List;

public class ArbreTest extends TestCase {
    Entier v1 = new Entier(1);
    Entier v2 = new Entier(5);
    Arbre<Entier> f1 = new Feuille<>(v1);
    Arbre<Entier> f2 = new Feuille<>(v2);
    Arbre<Entier> t = new Noeud<>(List.of(f1, f2));

    public void testTaille() {
        assertEquals(1, f1.taille());
        assertEquals(1, f2.taille());
        assertEquals(2, t.taille());
    }
}