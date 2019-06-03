package tuple;

/**
 * @author yuyz
 * @date 2019-01-10 14:26
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D four;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.four = d;
    }
    public String toString() {
        return "("  + first + "," + second + "," + three + "," + four + ")";
    }
}
