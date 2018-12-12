package CollectionAndIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yuyz
 * @date 2018-11-15 21:56
 */
class ReversiableArrayList<T> extends ArrayList<T> {
    public ReversiableArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext () {
                        return current > -1;
                    }
                    public T next () {
                        return get(current--);
                    }
                    public void remove () {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversiableArrayList<String> ral =
                new ReversiableArrayList<String>(Arrays.asList("To be or not to be".split(" ")));

        for(String str : ral) {
            System.out.print(str + " ");

        }
        System.out.println("--------------------");
        for(String str : ral.reversed()) {

            System.out.print(str + " ");
        }
    }
}
