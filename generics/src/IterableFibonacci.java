import java.util.Iterator;

/**
 * @author yuyz
 * @date 2019-01-14 20:47
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int c = 0;
    public IterableFibonacci() {}
    public IterableFibonacci(int size) {
        this.c = size;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return c >0;
            }
            public Integer next() {
                c--;
                return IterableFibonacci.this.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci it = new IterableFibonacci(6);
        for(Integer i : it)
            System.out.print(i + " ");
    }
}
