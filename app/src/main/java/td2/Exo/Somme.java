package td2.Exo;

@FunctionalInterface
public interface Somme <T> {
    T somme(T x, T y);

    Somme<Integer> additionInt = new Somme<Integer>() {
        @Override
        public Integer somme(Integer x, Integer y) {
            return x + y;
        }
    };

    Somme<Double> additionDouble = new Somme<Double>() {
        @Override
        public Double somme(Double x, Double y) {
            return x + y;
        }
    };

    Somme<Long> additionLong = new Somme<Long>() {
        @Override
        public Long somme(Long x, Long y) {
            return x + y;
        }
    };

    Somme<String> additionString = new Somme<String>() {
        @Override
        public String somme(String x, String y) {
            return x + y;
        }
    };
}
