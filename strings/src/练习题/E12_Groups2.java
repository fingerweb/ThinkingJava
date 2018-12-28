package 练习题;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2018-12-28 20:26
 */
public class E12_Groups2 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        Matcher m =
                Pattern.compile("\\b(?!([A-Z])\\w+)\\b")
                        .matcher("Hello hello Mother father sister ge Ge");
        while(m.find())
            words.add(m.group(1));
        System.out.println(("Number of unique words = " + words.size()));
        for(String str : words)
            System.out.println(str + "   ");
    }
}
