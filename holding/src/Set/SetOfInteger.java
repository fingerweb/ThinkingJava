package Set;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * NO.415
 * HashSet存储本身是无序的,但是当存储的数值类型的时候,就会有序的存储
 * 当时当存储其他类型(String),输出的结果就是无序的.
 * 所以HashSet存储还是无序的.
 * @author yuyz
 * @date 2018-11-14 18:26
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 30; i++){
            set.add(random.nextInt(30));
        }

        Iterator iterator = set.iterator();
        System.out.println("当无序存储数值类型的时候,输出的是有序的,显示如下:");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(("----------------------------------"));
        Set<String> strSet = new HashSet<String>();
        strSet.add("AD");
        strSet.add("BA");
        strSet.add("CM");
        strSet.add("DD");
        strSet.add("EA");
        strSet.add("FM");
        Iterator iterator1 = strSet.iterator();
        System.out.println("当有序存储String类型数值的时候,输出是无序的,显示如下:");
        while(iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }
    }
}

