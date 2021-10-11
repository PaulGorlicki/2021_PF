package td1;

public class Paire<A,B> implements IPaire<A,B> {
    private A fst;
    private B snd;

    public Paire(final A fst, final B snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public A fst() {
        return fst;
    }

    @Override
    public B snd() {
        return snd;
    }

    @Override
    public <C> IPaire<A, B> changeFst(C value) {
        //return <value, snd>;
        return null;
    }

    @Override
    public <C> IPaire<A, B> changeSnd(C value) {
        //return <fst, value>;
        return null;
    }

    @Override
    public String toString() {
        String s = new String("(" + fst + "," + snd + ") :: Paire[" + fst.getClass().getSimpleName() + "," + snd.getClass().getSimpleName() +"]");
        return s;
    }
    
}
