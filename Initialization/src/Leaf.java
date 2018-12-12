/**
 * No.168
 * this的用法返回对当前对象的引用
 * @author yuyz
 * @date 2018-10-29 14:26
 */
public class Leaf {
    int i;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
