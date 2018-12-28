import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2018-12-27 19:52
 */
public class TheReplacements {
    public static void main(String[] args) {
        String str = "/* Here's   a   black   of, text to use as input to the regular expression matcher." +
                "   Note that we'll first extract the black of text by looking for the spacial delimiter" +
                " ,then  process the extracted block.!*/" + " this is a motify you hi hello";
        Pattern pattern = Pattern.compile("/\\*(.*)\\*/");
        Matcher mathcer = pattern.matcher(str);
        while(mathcer.find()){
            String s = mathcer.group(1);
            System.out.println(s);
            String s1 = s.replaceAll(" {2,}", " ");
            System.out.println(s1);
            String s2 = s.replaceAll("(?m)^ +", "");
            System.out.println(s2);
            String s3 = s.replaceFirst("[aeiou]", "(VIEW!)");
            System.out.println(s3);
            StringBuffer sbuf = new StringBuffer();
            Pattern p = Pattern.compile("[aeiou]");
            Matcher macher = p.matcher(s3);
            while(macher.find())
                macher.appendReplacement(sbuf, macher.group().toUpperCase());
            macher.appendTail(sbuf);
            System.out.println(sbuf);
        }

    }
}
