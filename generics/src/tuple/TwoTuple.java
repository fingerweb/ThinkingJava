package tuple;

/**
 * @author yuyz
 * @date 2019-01-10 14:12
 */
class InterClass {
    private int num;
    public InterClass(int num) {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}
public class TwoTuple<A, B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }
    public String toString() {
        return "("  + first + "," + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<InterClass, String> twoTuple = new TwoTuple<InterClass, String>(new InterClass(4), "yuyz");
         /*
        compile Error.variable first is a final variable
        twoTuple.first = new InterClass(2);
        */
        System.out.println(twoTuple.first.getNum());
        twoTuple.first.setNum(5);
        System.out.println(twoTuple.first.getNum());
    }
}
