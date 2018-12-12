import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * No.190
 * 静态块的初始化
 * @author yuyz
 * @date 2018-10-29 14:11
 */
class Cup{
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
