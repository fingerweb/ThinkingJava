import util.Generator;

/**
 * @author yuyz
 * @date 2019-01-14 20:36
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }
    public int fib(int n) {
        if(n < 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        for(int i =0; i < 18; i++)
            System.out.print(fib.next() + " ");
    }
}
