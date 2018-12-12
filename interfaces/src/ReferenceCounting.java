import java.sql.PreparedStatement;
import java.util.FormatterClosedException;

/**
 * 如果成员变量存在于其他一个或对个对象共享,使用引用计数来跟踪访问着共享对象的对象数量.
 * @author yuyz
 * @date 2018-10-30 15:41
 */
class Share{
    private int refcount = 0;
    private static int counter = 0;
    private final int id = counter++;
    public Share(){
        System.out.println("Creating " + this);
    }
    public String toString(){
        return "Share " + id;
    }
    public void addRef(){
        refcount++;
    }
    public void dispose(){
        if(--refcount == 0){
            System.out.println("dispose Share " + id);
        }
    }
}
class Component{
    Share share;
    private static int counter = 0;
    private final int id = counter++;
    public String toString(){
        return "Component " + id;
    }
    public Component(Share share){
        System.out.println("Creating " + this);
        this.share = share;
        this.share.addRef();
    }
    public void dispose(){
        System.out.println("dispose " + this);
        this.share.dispose();
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Share share = new Share();
        Component[] components = {new Component(share), new Component(share),
                new Component(share), new Component(share)};
        for(Component component : components) {
            component.dispose();
        }
    }

}
