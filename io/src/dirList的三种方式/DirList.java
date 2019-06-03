package dirList的三种方式;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2019-01-31 15:12
 */
class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
public class DirList {
    public static void main(String[] args) {
        File path = new File("E:\\ThinkingJava\\strings\\src");
        String[] list;
        list = path.list(new DirFilter("^\\w+\\.java"));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
