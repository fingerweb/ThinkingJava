package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author yuyz
 * @date 2019-02-19 13:54
 */
public class PPrint {
    public static String Pformat(Collection<?> c) {
        if(c.size() == 0)
            return "[]";
        StringBuilder result = new StringBuilder("[");
        for(Object elem : c) {
            if(c.size() != 1)
                result.append("\n ");
            result.append(elem);
        }
        if(c.size() != 1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }

    public static void pprint(Collection<?> c) {
        System.out.println(Pformat(c));
    }
    public static void pprint(Object[] obj) {
        System.out.println(Pformat(Arrays.asList(obj)));
    }
}
