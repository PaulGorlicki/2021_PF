package td1;

import junit.framework.TestCase;
import java.util.Set;

public class FeuilleTest extends TestCase {
    Feuille A = new Feuille(4);
    Feuille B = new Feuille ("bonjour");

    public void testTaille() {
        assertEquals(1, A.taille());
        assertEquals(1, B.taille());
    }

    public void testContientTrue() {
        assertEquals(true, A.contient(4));
        assertEquals(true, B.contient("bonjour"));
    }

    public void testContientFalse() {
        assertEquals(false, A.contient(2));
        assertEquals(false, B.contient(1));
    }

    public void testSomme() {
        assertEquals(4, A.somme());
        assertEquals("bonjour", B.somme());
    }

    public void testMin() {
        assertEquals(4, A.min());
        assertEquals("bonjour", B.min());
    }

    public void testValeur() {
        assertEquals(Set.of(4), A.valeurs());
        assertEquals(Set.of("bonjour"), B.valeurs());
    }
}