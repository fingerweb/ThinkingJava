import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yuyz
 * @date 2019-01-03 19:02
 */
class MethodSelector implements InvocationHandler {
    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("interesting"))
            System.out.println("Proxy detected the interesting method");

        if(args != null && args[0].toString().equals("bonobo"))
            System.out.println(args[0].toString());
        return method.invoke(proxied, args);
    }
}
interface SomeMethods {
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}
class Implements implements SomeMethods {
    public void boring1(){
        System.out.println("boring1");
    }
    public void boring2(){
        System.out.println("boring2");
    }
    public void boring3() {
        System.out.println("boring3");
    }
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }
}
public class SelectingMethods {
    public static void main(String[] args) {
        SomeMethods someMethods = (SomeMethods) Proxy.newProxyInstance(
          SomeMethods.class.getClassLoader(),
          new Class[]{SomeMethods.class},
          new MethodSelector(new Implements())
        );

        someMethods.boring1();
        someMethods.boring2();
        someMethods.interesting("bonobo");
        someMethods.boring3();
    }
}
