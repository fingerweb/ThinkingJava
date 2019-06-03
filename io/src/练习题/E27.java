package 练习题;

import java.io.*;

/**
 * @author yuyz
 * @date 2019-03-21 20:05
 */
class House implements Serializable {
    private char c;
    private int i;
    private House next;
    public House(int i, char c) {
        this.i = i;
        this.c = c;
        if(--i > 0)
            next = new House(i, (char)(c + 1));
    }
    public String toString() {
        return i + "," + c +";" + "next: " + next;
    }
}
public class E27 {
    public static void main(String[] args) throws Exception{
        House house = new House(2, 'a');
        System.out.println("house : " + house);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("E:\\ThinkingJava\\io\\src\\write"));
        out.writeObject("House Storage\n");
        out.writeObject(house);
        out.close();


        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("E:\\ThinkingJava\\io\\src\\write"));
        String s = (String)in.readObject();
        House h = (House)in.readObject();
        System.out.println(s);
        System.out.println("s : " + h);
    }
}
