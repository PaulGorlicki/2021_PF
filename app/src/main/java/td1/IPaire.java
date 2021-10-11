package td1;

public interface IPaire<A,B> {
    A fst();
    B snd();
    <C> IPaire<A,B> changeFst(C value);
    <C> IPaire<A,B> changeSnd(C value);
}
