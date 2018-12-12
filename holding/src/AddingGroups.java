import java.awt.print.PrinterGraphics;
import java.util.*;

/**
 * NO.396.
 * 当向Collection中添加元素的时候,如果是单个元素,用add()方法
 * 如果向Collection中添加容器(合并容器)
 * Collection.addAll(Collection<? extends E> c)或者Collections.addAll(Collection<? super T> c, T... elements);
 * Collection.addAll()方法里面的参数是一个Collection,而Collections.addAll()参数是Collection,以及一个数组 或者用','分割的列表
 * Collection.addAll()成员方法只能接受另一个Collection对象作为参数.
 * @author yuyz
 * @date 2018-10-31 13:33
 */
class Dog {
    private static int counter;
    private final int id;
    Dog() {
        id = counter++;
    }
    public String toString() {
        return "Dog " + id;
    }
}
public class AddingGroups {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<Character>();
        characters.add('a');
        List<Character> chars = new ArrayList<Character>();
        chars.add('b');
        //Collection.addAll():参数是容器
        characters.addAll(chars);
        Collections.addAll(characters, 'c', 'd');
        for (Character character : characters) {
            System.out.println(character);
        }
        System.out.println("---------------------");
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        Dog[] d = {new Dog(), new Dog()};
        //Collections.addAll()参数是用','分割的列表
        Collections.addAll(dogs, new Dog(),new Dog());
        //Collections.addAll()参数是数组
        Collections.addAll(dogs, d);

        for(Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
