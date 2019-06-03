import java.util.*;
/**
 * @author yuyz
 * @date 2019-01-29 9:08
 */
public class SortedDemo {
    public static void main(String[] args) {
        //SortedSet,排序的Set,TreeSet是SortedSet接口唯一的实现.
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));

        System.out.println(sortedSet);
        //Object first()返回容器中第一个元素
        String low = sortedSet.first();
        //Object last()放回容器中最后一个元素
        String high = sortedSet.last();

        System.out.println(low);
        System.out.println(high);

        Iterator<String> it = sortedSet.iterator();
        for(int i = 0; i <= 6; i++) {
            if(i == 3)
                low = it.next();
            if (i == 6)
                high = it.next();
            else
                it.next();
        }
        System.out.println(low);
        System.out.println(high);
        //SortedSet subSet(fromElement, toElement):返回Set的子集从fromElement开始,不包含toElement
        System.out.println(sortedSet.subSet(low, high));
        //SortedSet headSet(toElement):返回Set的子集,由小于element的元素组成.
        System.out.println(sortedSet.headSet(high));
        //Sortedset tailSet(fromElement):返回Set的子集,由大于或等于fromElement的元素组成.
        System.out.println(sortedSet.tailSet(low));
    }

}
