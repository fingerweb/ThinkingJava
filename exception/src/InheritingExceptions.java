/**
 * @author yuyz
 * @date 2018-12-06 11:16
 */
class SimpleException extends Exception{}
public class InheritingExceptions {
    public static void f() throws SimpleException {
        System.out.println("throw SimpleException from InheritingExceptions.f().");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        try {
            f();
        }catch(SimpleException e) {
            System.out.println("Catch it.");
        }
    }
}
