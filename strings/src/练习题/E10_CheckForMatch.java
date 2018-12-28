package 练习题;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2018-12-27 8:52
 */
public class E10_CheckForMatch {
    public static void main(String[] args) {

        /**
         * ^Java (以Java为一行的开始)  "^Java"和"[^Java]"要区分，“^Java”表示已Java开始的一行，"[^Java]"表示不包含J,a,v以外的任何字符
         * \\Breg.* \B 非词边界 \b词边界  模式"\\Breg.*" 匹配 "regular" 不成功的,模式"\\breg.*"匹配"regular"是成功的.
         * .* 任意字符
         */
        String source = "Java now has regular expressions";
        String[] regEx = {"^Java", "\\Breg.*",
                "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.",
                "s{0,3}"};
        System.out.println("Source string: " + source);
        for(String pattern : regEx) {
            System.out.println(
                    "Regular expression: \"" + pattern + "\"");
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(source);
            while(m.find()) {
                System.out.println("Match \"" + m.group() +
                        "\" at positions " + m.start() + "-" +
                        (m.end() - 1));
            }
        }
        System.out.println("**************************");
        Pattern pattern = Pattern.compile("\\Breg.*");
        Matcher matcher = pattern.matcher("cregular");
        while(matcher.find()){
            System.out.println(matcher.group() + ":" + matcher.start() + "-" +(matcher.end()-1));
        }
        System.out.println("--------------------------");
        System.out.println(Pattern.matches("n\\ww", "now"));
    }
}