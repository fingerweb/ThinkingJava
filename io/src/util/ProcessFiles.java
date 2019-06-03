package util;

import java.io.File;
import java.io.IOException;

/**
 * @author yuyz
 * @date 2019-02-20 9:26
 */
public class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy;
    private String ext;
    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }
    public void start(String[] args) {
        try {
            if(args.length == 0)
                processDirectoryTree(new File("."));
            else {
                for(String arg : args) {
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        if(!arg.endsWith("." + ext))
                            arg += "." + ext;
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
            }
        } catch(IOException e) {
            throw new RuntimeException();
        }
    }
    public void processDirectoryTree(File root) throws IOException {
        //Directory.walk()方法返回的是TreeInfo.TreeInfo实现了Iterable接口.所以可以用于foreach.
        /**
         * public static class TreeInfo implements Iterable<File> {
         *       ......
         *       public Iterator<File> iterator() {
         *               return files.iterator();
         *       }
         *       ......
         *
         * }
         */
        for(File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext))
            strategy.process(file);
    }
    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy(){
            public void process(File file) {
                System.out.println(file);
            }
        }, "java").start(args);
    }
}
