/**
 * 这是第八章多态练习9和第九章接口练习9的结合体
 * 这个练习还复习了枚举类型的定义
 * 用基类当作接口,传入的值是子类.
 * @author yuyz
 * @date 2018-10-30 15:59
 */
enum House{
    CAVE, HOLE,GROTTO;
}
abstract class Rodent{
    public abstract void eat();
    public abstract void sleep(House house);
}
class Mouse extends Rodent{

    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void sleep(House house) {
        System.out.println("Mouse.sleep()" + house);
    }
}
class Gerbil extends Rodent{

    @Override
    public void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    public void sleep(House house) {
        System.out.println("Gerbil.sleep()" + house);
    }
}
public class Animal {
    static void tune(Rodent rodent){
        rodent.sleep(House.CAVE);
    }
    static void tuneAll(Rodent[] rodents) {
        for(Rodent rodent : rodents){
            tune(rodent);
        }
    }

    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil()};
        Animal.tuneAll(rodents);
    }
}
