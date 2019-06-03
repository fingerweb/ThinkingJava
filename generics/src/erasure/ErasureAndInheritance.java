package erasure;

/**
 * @author yuyz
 * @date 2019-01-16 14:59
 */
class GenericBase<T> {
    private T element;
    public void set(T set) {
        this.element = set;
    }
    public T get() {
        return element;
    }
}
class Derived1<T> extends GenericBase<T> {}
class Derived2 extends GenericBase {}
//class Derived3 extends GenericBase<?> {}
//Strange Error:
// unexpected type found : ?
//required: class or interface without bounds
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        Object obj = d.get();
        System.out.println(obj);
        String str = "1";
        d.set(str);
        System.out.println(d.get());
    }
}
