package finalWord;

/**
 * final参数
 * 你可以读取final参数的值,但是无法修改它的值.
 * 主要用来向匿名内部类传递参数.
 * @author yuyz
 * @date 2018-10-30 14:32
 */
class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo g){
        //! g = new Gizmo(); illegal --- g is final
    }
    void f(final int i){
       //! i++;  illegal  ---g is final
    }
    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        System.out.println(bf.g(3));
    }
}
