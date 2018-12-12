package Set;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * No.416
 * 知识点1:TreeSet将元素存储在红黑树数据结构中,所以他会结果进行排序.
 * 知识点2:String类型的默认排序:先比较字符串中第一个字符,如果相等,比较第二个,依次类推.不是按照字符串的长度比较.
 * @author yuyz
 * @date 2018-11-14 19:15
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random();
        Set<String> strSet = new TreeSet<String>();
        String str = "A";
        System.out.println("存储的顺序:");
        for(int i = 0; i < 9; i++) {
            strSet.add(str + i);
            System.out.print(str + i + "  ");
        }
        System.out.println();
        System.out.println("输出的顺序:");
        System.out.println(strSet);
    }
}
