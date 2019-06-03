package 练习题;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author yuyz
 * @date 2019-03-18 21:54
 */
public class E07 {
   public static List<String> read(String filename) throws Exception {
       String filepath = "E:\\ThinkingJava\\io\\src\\练习题\\";
       FileReader fileReader = new FileReader(filepath + filename);
       BufferedReader in = new BufferedReader(fileReader);
       List<String> list = new LinkedList<String>();
       String s;
       while((s = in.readLine()) != null)
           list.add(s + "\n");
       in.close();
       return list;
   }
   public static void main(String[] args) throws Exception{
       List<String> list = read("E07.java");
       for(ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();)
           System.out.print(it.previous());
   }
}
