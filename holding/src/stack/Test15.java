package stack;

/**
 * 练习15
 * 栈在编程语言中经常用来对表达式求值.用Stack对下面的表达式求值,其中'+'表示入栈,'-'表示出栈并打印
 * +U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---
 * @author yuyz
 * @date 2018-11-11 20:08
 */
public class Test15 {
    private static final  Stack<Character> stack = new Stack<Character>();
    public static void operation(String str) {
        char [] chars =str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    stack.push(chars[++i]);
                    break;
                case '-':
                    System.out.print(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        Test15.operation("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
