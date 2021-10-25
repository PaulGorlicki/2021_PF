package td2.Exo;

public class Client {
    private int taille;
    private double poids;
    public Client (int taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }
}
