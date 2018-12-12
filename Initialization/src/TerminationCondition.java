/**
 * @author yuyz
 * System.gc()是主动让JVM执行GC(垃圾回收机制)
 * 在调用垃圾回收机制的时候,会在垃圾回收之前调用finalize()方法.
 * @date 2018-10-30 9:27
 */
class Book{
    boolean checkedOut = false;
    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    void checkedIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //novel.checkedIn();
        //novel = null;
        //new Book(true);
        System.gc();
    }
}
