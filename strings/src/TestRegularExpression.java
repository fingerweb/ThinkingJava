import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2018-12-27 8:27
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String[] Args = {"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"};
        System.out.println("Input: " + Args[0]);
        for(String arg : Args) {
            System.out.println("Regular expression : \"" + arg + "\"");
            Pattern pattern = Pattern.compile(arg);
            Matcher matcher = pattern.matcher(Args[0]);
            while(matcher.find()){
                System.out.println(matcher.group() + ":" + matcher.start() + "-" + (matcher.end()-1));
            }
        }
        System.out.println("------------------------");
        System.out.println(Pattern.matches("(abc){2,}", "abcabc"));
    }
}
