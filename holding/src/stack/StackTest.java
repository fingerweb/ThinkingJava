package stack;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author yuyz
 * @date 2018-11-11 19:26
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack<String> stack1 = new Stack<String>();
        stack1.push("I");
        stack1.push("am");
        stack1.push("You");
        //这里更正一下,一开始,我想用Collections.addAll(Collection<? super T> c, T... elements);
        //可是发现不行,原来Collections.addAll()方法的参数有2个,第一个为Collections类及其子类的参数,
        //第二个为容器内元素的类型.
        for(String s : "I am YOU".split(" "))
            stack.push(s);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
