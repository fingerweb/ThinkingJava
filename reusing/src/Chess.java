/**
 * No.245
 * 当子类继承父类的时候,如果父类的构造器是带参数时,需要super()传入参数
 * 创建对象的时候,构造器的调用顺序是:从根节点到子节点的顺序开始掉用
 * @author yuyz
 * @date 2018-10-30 9:42
 */
class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}
public class Chess extends Game{
    Chess(){
        super(3);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new Chess();
    }
}
