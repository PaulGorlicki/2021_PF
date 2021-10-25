package td2.Exo;

@FunctionalInterface
public interface ToString <T> {
    T toString(T x);

    ToString<Object> ConvertString = new ToString<Object>() {

        @Override
        public Object toString(Object x) {
            return x.toString();
        }
    };
}
