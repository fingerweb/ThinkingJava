import java.util.*;

/**
 * @author yuyz
 * @date 2019-01-28 14:25
 */
class SetType {
    int i;
    public SetType(int i) {
        this.i = i;
    }
    public boolean equals(Object o) {
        return o instanceof SetType && (i == ((SetType)o).i);
    }
    public String toString() {
        return Integer.toString(i);
    }
}
class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }
    public int hashCode() {
        return i;
    }
}
class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n) {
        super(n);
    }

    public int compareTo(TreeType args) {
        return (args.i < i ) ? -1 : (args.i == i ? 0 : 1);
    }
}
public class TypesForSets {
    static <E> Set<E> fill(Set<E> set, Class<E> type) {
        try {
            for (int i = 0; i < 10; i++)
                set.add(type.getConstructor(int.class).newInstance(i));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return set;
    }
    static <T> void test(Set<T> set, Class<T> type){
        fill(set, type);
        fill(set, type);
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        test(new HashSet<HashType>(), HashType.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);

        try {
            test(new TreeSet<SetType>(), SetType.class);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            test(new TreeSet<HashType>(), HashType.class);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

