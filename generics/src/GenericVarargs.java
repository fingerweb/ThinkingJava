import java.util.ArrayList;
import java.util.List;

/**
 * @author yuyz
 * @date 2019-01-15 10:15
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for(T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("ABCDEFGHIJK".split(""));
        System.out.println(ls);
    }
}
