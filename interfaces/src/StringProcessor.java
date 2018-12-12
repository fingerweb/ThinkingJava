import publicInterface.Processor;

import java.util.Arrays;

/**
 * @author yuyz
 * @date 2018-10-30 21:53
 */
public abstract class StringProcessor implements Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String str =
            "If she weighs the same as a duck, she's made of wood";
    public static void main(String[] args) {
        Apply.process(new UpCase1(), str);
        Apply.process(new LowerCase1(), str);
        Apply.process(new Spliter1(), str);

    }
}
class UpCase1 extends StringProcessor{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class LowerCase1 extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Spliter1 extends StringProcessor{
    public String process(Object input) {
        String[] arrays = ((String)input).split(" ");
        return Arrays.toString(arrays);
    }
}
