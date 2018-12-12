package finalWord;

/**
 * No.265
 * java允许final定义的变量没有初始值,但是一定要确保在使用前,必须初始化.
 * @author yuyz
 * @date 2018-10-30 13:01
 */
class Poppet{
    private int i;
    Poppet(int ii){
        i = ii;
    }
}
public class BlankFinal {
    private final int i = 1;
    private final int j;
    private final Poppet p;
    //Blank finals must be initialized in the constructor
    public BlankFinal(){
        j = 2;              //initialized blank final
        p = new Poppet(2);      //initialized blank final reference
    }
    public BlankFinal(int x){
        j = x;              //initialized blank final
        p = new Poppet(x);      //initialized blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(12);
    }
}
