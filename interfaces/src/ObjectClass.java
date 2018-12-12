/**
 * @author yuyz
 * @date 2018-10-30 21:46
 */
class FatherClass {
    public void play() {
        System.out.println(this + ".play()");
    }
    public String toString() {
        return "FatherClass";
    }
}

class ChildClass extends FatherClass {
    public String toString() {
        return "ChildClass";
    }
}

public class ObjectClass {
    public static FatherClass tunel() {
        return new ChildClass();
    }
    public static void main(String[] args) {
        FatherClass fatherClass = tunel();
        System.out.println(fatherClass);
    }

}
