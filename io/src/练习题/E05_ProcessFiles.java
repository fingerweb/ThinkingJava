package 练习题;

import util.Directory;

import java.io.File;
import java.io.IOException;

/**
 * @author yuyz
 * @date 2019-03-18 19:40
 */
public class E05_ProcessFiles {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy;
    private String regex;
    public E05_ProcessFiles(Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
    }

    public void start(String[] args) {
        try {
            if(args.length == 0)
                ProcessDirectoryTree(new File("."));
            else
                for(String arg : args) {
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        ProcessDirectoryTree(fileArg);
                    else
                        if(arg.matches(regex))
                            strategy.process(fileArg.getCanonicalFile());
                }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ProcessDirectoryTree(File root) throws IOException {
        for(File file : Directory.walk(root.getAbsolutePath(), regex))
            strategy.process(file.getCanonicalFile());
    }

    public static void main(String[] args) {
        new E05_ProcessFiles(new E05_ProcessFiles.Strategy(){
            public void process(File file) {
                System.out.println(file);
            }
        }, ".*\\.java").start(args);
    }
}
