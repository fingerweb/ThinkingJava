package util;

import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author yuyz
 * @date 2019-02-19 12:51
 */
public final class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path, String regex) {
        return local(new File(path), regex);
    }

    //a two-tuple for returning a pair of objects
    //TreeInfo的使命只是将对象收集起来
    public static class TreeInfo implements Iterable<File> {
        //files和dirs被有意的用public修饰
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();
        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }
        void addAll(TreeInfo another) {
            files.addAll(another.files);
            dirs.addAll(another.dirs);
        }
        public String toString() {
            return "dirs: " + PPrint.Pformat(dirs) +
                    "\n\n files: " + PPrint.Pformat(files);
        }
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for(File item : startDir.listFiles()) {
            if(item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if(item.getName().matches(regex))
                    result.files.add(item);
            }
        }
        return result;
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }
    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println(walk("E:\\ThinkingJava\\strings\\src"));
    }
}
