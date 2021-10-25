package td2.Exo;

public interface Sommable<T> {
    T sommer(final T autre);
    T zero();
}