import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.print.Printable;
import java.util.Random;

/**
 * @author yuyz
 * @date 2018-12-26 14:10
 */
public class UsingStringBuilder {
    public String toString() {
        Random random = new Random(47);
        StringBuilder str = new StringBuilder("[");
        for(int i = 0; i < 25; i++){
            str.append(random.nextInt(100)+1);
            str.append(", ");
        }
        str.delete(str.length()-2, str.length());
        str.append("]");
        return str.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder us = new UsingStringBuilder();
        System.out.println(us);
    }
}
