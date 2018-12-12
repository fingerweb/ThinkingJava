/**
 * 练习9，联系12
 * 对于必须要清理的工作，不要寄希望于GC，要自己创建清理工作的方法。在适合的地方调用他们。
 * @author yuyz
 * @date 2018-10-30 12:45
 */
class Component1{
    Component1(int i){
        System.out.println("Component1 Constructor");
    }
    public void dispose(){
        System.out.println("Component1 dispose");
    }
}
class Component2{
    Component2(int i){
        System.out.println("Component2 Constructor");
    }
    public void dispose(){
        System.out.println("Component2 dispose");
    }
}
class Component3{
    Component3(int i){
        System.out.println("Component3 Constructor");
    }
    public void dispose(){
        System.out.println("Component3 dispose");
    }
}
class Root{
    Component1 com1;
    Component2 com2;
    Component3 com3;
    Root(int i){
        com1 = new Component1(i);
        com2 = new Component2(i);
        com3 = new Component3(i);
        System.out.println("Root Constructor");
    }
    public void dispose(){
        System.out.println("Root dispose");
        com1.dispose();
        com2.dispose();
        com3.dispose();
    }
}
public class Stem extends Root{
    Stem(int i){
        super(i);
        System.out.println("Stem Constructor");
    }
    public void dispose(){
        System.out.println("Stem dispose");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = null;
        try{
            stem = new Stem(1);
        }finally{
            stem.dispose();
        }
    }
}
