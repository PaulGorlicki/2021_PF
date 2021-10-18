package td1;

public class Entier implements Sommable <Entier> {
    private int entier;

    public Entier(int entier) {
        this.entier = entier;
    }

    @Override
    public Entier sommer(Entier other) {
        return null;
    }
}
