import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author yuyz
 * @date 2019-03-20 16:20
 */
public class TestEOF {
    public static void main(String[] args) throws Exception{
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("E:\\ThinkingJava\\io\\src\\read")));
        while(in.available() != 0)
            System.out.print((char)in.readByte());
    }
}
