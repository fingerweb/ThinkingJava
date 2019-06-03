import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/**
 * @author yuyz
 * @date 2019-03-20 16:05
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws Exception{
        try {
            //必须为ByteArrayInputStream提供字节数组,为了产生该数组,String包含了一个可以实现的getBytes()方法.
            //所产生的ByteArrayInputStream是一个适合传递DataInputStream的InputStream.
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("read").getBytes()));
            //available()方法查看还有多少可供存取的字符,每读取一个字符,就减一.
            System.out.println(in.available());
            while(in.available() != 0)
                //readByte()一次一个字节地读取字符.
                System.out.print((char)in.readByte());
            System.out.println(in.available());
        }catch(Exception e) {
            System.out.println();
        }
    }
}
