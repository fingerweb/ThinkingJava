package erasure;

/**
 * @author yuyz
 * @date 2019-01-16 14:57
 */
class HasF {
    public void f() {
        System.out.println("HasF.f()");
    }
}
class Manipulator<T extends HasF> {
    private T obj;
    public Manipulator(T t) {
        this.obj = t;
    }
    public void manipulate() {
        //Can't compile
        obj.f();
    }
}
public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
        manipulator.manipulate();
    }
}
