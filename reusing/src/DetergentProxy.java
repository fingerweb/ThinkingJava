/**
 * 这是代理模式(介于组合和继承之间)
 * 子类会继承父类所有的public的成员变量和方法
 * 我们使用代理可以拥有更多的控制力,我们可以选择只是提供成员对象中方法的子集
 * @author yuyz
 * @date 2018-10-30 10:02
 */
class CleanserProxy{
    private String s = "Cleanser";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }
    public String getS(){
        return s;
    }
    public String toString(){
        return s;
    }
}
public class DetergentProxy {
    private CleanserProxy cleanserProxy;
    DetergentProxy(){
        cleanserProxy = new CleanserProxy();
    }
    public void dilute(){
        cleanserProxy.dilute();
    }
    public void apply(){
        cleanserProxy.apply();
    }
    public String toString(){
        return cleanserProxy.getS();
    }

    public static void main(String[] args) {
        DetergentProxy detergentProxy = new DetergentProxy();
        detergentProxy.dilute();
        detergentProxy.apply();
        System.out.println(detergentProxy);
    }
}
