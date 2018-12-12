package Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 知识点1:自定义对象排序要实现Compareable<T>接口和public int compareTo(T t)抽象方法.
 * 知识点2:TreeSet用红黑树数据结构存储元素,能对结果进行排序.
 * @author yuyz
 * @date 2018-11-14 19:46
 */
class Order implements Comparator<Order> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Order o1, Order o2) {
        return (o1.getAge()<o2.getAge()) ? -1 : (o1.getAge() == o2.getAge() ? 0 : 1);
    }
}
class Person implements Comparable<Person>{
    private int age;
    private String name;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int compare(Person p1, Person p2) {
        return (p1.getAge()<p2.getAge()) ? -1 : ((p1.getAge() == p2.getAge() ? 0 : 1));
    }
    @Override
    public int compareTo(Person p) {
        return compare(this, p);
    }
    public String toString() {
        return "[" + "name:" + name + " age:" +age + "]";
    }

}
public class ObjectCompareTo {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>();
        set.add(new Person("aa", 11));
        set.add(new Person("bb", 3));
        set.add(new Person("cc", 4));
        set.add(new Person("dd", 12));
        System.out.println(set);
    }
}

