package coffee;

import util.Generator;
import java.util.Iterator;
import java.util.Random;

/**
 * @author yuyz
 * @date 2019-01-14 19:01
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    Class[] type = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private static Random random = new Random(47);
    public CoffeeGenerator() {}
    //for iteration;
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) type[random.nextInt(type.length)].newInstance();
        }catch(Exception e) {
            throw new RuntimeException();
        }
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            //Not implemented
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }

}
