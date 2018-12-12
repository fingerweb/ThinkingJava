/**
 * 练习三
 * 输出结果是0 2
 * 首先在初始化对象的时候，将成员变量的值为默认值（i=0）,ChildBasic是Basic的子类
 * 调用父类的构造方法，父类构造方法调用了point()方法，而point()被重写了，所以调用ChildBasic类的point()方法
 * 打印i(i为0)，父类的构造方法调用完之后，按照顺序初始化对象的变量值(i=2).
 * @author yuyz
 * @date 2018-10-30 21:13
 */
abstract class Basic{
    Basic(){
        point();
    }
    public abstract void point();
}
class ChildBasic extends Basic{
    private int i =2;
    public void point(){
        System.out.println(i);
    }
}
public class Constructor {
    public static void main(String[] args) {
        ChildBasic childBasic = new ChildBasic();
        childBasic.point();
    }
}
