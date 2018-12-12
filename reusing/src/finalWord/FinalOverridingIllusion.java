package finalWord;

/**
 * final方法
 * 使用final修饰方法,是为了防止任何继承类重写这个方法的定义
 * final和private关键字
 * 类中所有private方法隐式地指定为final.由于无法取用private方法,所以无法覆盖它.
 * 对于private方法添加final修饰词,这样做是没有任何意义的
 * 如果某个方法是private,那么他不是基类接口的一部分,你无法重写他,当upcast时,你无法调用这个方法.
 * 如果在子类以相同的名称生成public,protected或者包访问权限的方法,仅是生成一个新的方法.
 * @author yuyz
 * @date 2018-10-30 15:20
 */
class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        //You can't upcast
        OverridingPrivate op = op2;
        // You can't call the methods
        //! op.f();
        //! op.g();

        //Same here:
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}
