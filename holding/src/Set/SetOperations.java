package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * NO.416
 *
 * @author yuyz
 * @date 2018-11-14 20:04
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, "A B C D E F G".split(" "));
        set.add("H");
        System.out.println("set集合中的元素:" + set);
        System.out.println("set contain H :" + set.contains("H"));
        System.out.println("set contain M :" + set.contains("M"));

        System.out.println("-----------------");
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A,B,C,D,E,Z".split(","));
        System.out.println("set集合中的元素:" + set);
        System.out.println("set1集合中的元素:" + set1);
        System.out.println("set集合中是否包含所有的set1集合中的元素:" + set.containsAll(set1));

        System.out.println("--------------------");
        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2, "A,B,C,d,e,f".split(","));
        System.out.println("set集合中的元素:" + set);
        System.out.println("set集合中的元素:" + set2);
        System.out.println("找到set2集合中,不属于set中的元素");
        Iterator<String> iterator = set2.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if(!set.contains(str)) {
                System.out.print(str + " ");
            }
        }
    }
}
