/**
 * @author yuyz
 * @date 2019-01-15 9:19
 */
public class GenericMethods {
    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(3);
    }
}
