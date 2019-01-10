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
        String str = " Hello hello Mother father sister ge Ge ";
        Set<String> set = new HashSet<String>();
        String pottern = "\\b((?![A-Z])\\w+)\\b";
        Pattern pattern = Pattern.compile(pottern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            set.add(matcher.group(1));
        }
        System.out.println(set.size());
        for(String st: set)
            System.out.println(st);

    }
}
