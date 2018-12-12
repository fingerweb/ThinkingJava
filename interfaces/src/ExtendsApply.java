import publicInterface.Processor;

import java.util.Arrays;

/**
 * No.320.
 * 策略设计模式
 * 概念:创建一个能够根据所传递的参数对象的不同而具有不同行为的方法
 * 这类方法包含所要执行算法中固定不变的部分,而策略包含变化的部分.
 * 策略就是传递进去的参数对象,它包含要执行的代码.
 * @author yuyz
 * @date 2018-10-30 21:19
 */
abstract class StringProcessor1 implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
}
class UpCase extends StringProcessor1{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class LowerCase extends StringProcessor1{
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor1{
    public String process(Object input){
        String[] arrays = ((String)input).split(" ");
        return Arrays.toString(arrays);
    }
}
public class ExtendsApply {
    public static String str = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        Apply.process(new UpCase(), str);
        Apply.process(new LowerCase(), str);
        Apply.process(new Splitter(), str);
    }
}
