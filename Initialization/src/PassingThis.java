/**
 * No.169
 * Peel是一个去皮器,有一个对苹果去皮的动作
 * Apple是一个苹果类,里面有一个去皮的动作getPeeled
 * Person有一个吃苹果的动作,在吃之前,需要先去皮
 * @author yuyz
 * @date 2018-10-29 14:36
 */
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yami");
    }
}
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
