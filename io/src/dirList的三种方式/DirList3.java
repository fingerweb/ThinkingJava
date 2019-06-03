package dirList的三种方式;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2019-01-31 16:14
 */
public class DirList3 {
    public static void main(String[] args) {
        File path = new File("E:\\ThinkingJava\\strings\\src");
        String[] list;
        //这里创建了一个匿名内部类
        list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile("\\w+\\.java");
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
