import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;

/**
 * @author yuyz
 * @date 2018-12-30 9:38
 */
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}
class Gum {
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy.");
        try {
            Class.forName("Gum");
        }catch(Exception e) {
            System.out.println("Can't find Gum");
        }
        System.out.println("After creating Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
