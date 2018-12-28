package 练习题;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2018-12-27 9:20
 */
public class E11_CheckForMatch2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(
                "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and " +
                "one orange while Anita hadn't any");
        while(m.find()) {
            System.out.println("Match \"" + m.group() +
                    "\" at positions " + m.start() + "-" +
                    (m.end() - 1));
        }
    }
}
