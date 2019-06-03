package 练习题;

import util.DirFilter;

import java.io.File;

/**
 * @author yuyz
 * @date 2019-03-18 15:37
 */
class SortedDirList {
    private File file;
    public SortedDirList(String pathname) {
        file = new File(pathname);
    }
    public String[] list() {
        return file.list();
    }
    public String[] list(String regex) {
        return file.list(new DirFilter(regex));
    }
}
public class E02_SortedDirList {
    public static void main(String[] args) {
        String[] list;
        list = new SortedDirList("E:\\ThinkingJava\\strings\\src").list("^\\w+\\.java");
        for(String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
