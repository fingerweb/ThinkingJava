import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author yuyz
 * @date 2019-03-20 19:48
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception{
        //Write a file
        //getChannel()方法会产生一个FileChannel
        FileChannel fc =
                new FileOutputStream("E:\\ThinkingJava\\io\\src\\read").getChannel();
        //ByteBuffer是直接和通道交互的缓冲器
        //wrap(byte[])将已存在的字节数组"包装"到ByteBuffer中
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        //close()表示通道关闭.
        fc.close();
        //Add to the ned of the file

        fc =
                new RandomAccessFile("E:\\ThinkingJava\\io\\src\\read", "rw").getChannel();
        //Move to the end
        //position(int),移动到通道的具体位置.
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        //Read the file
        fc = new FileInputStream("E:\\ThinkingJava\\io\\src\\read").getChannel();
        //对于只读访问,我们必须显式地使用静态的allocate()方法来分配ByteBuffer
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        //一旦调用read()来告知FileChannel向ByteBuffer存储字节,就必须调用缓冲器上的flip(),让它做好让别人读取字节的准备.
        //如果我们打算使用缓冲器执行进一步的read()操作,我们也必须的调用clear()来为每个read()做好准备.
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining())
            System.out.print((char)buff.get());
    }
}
