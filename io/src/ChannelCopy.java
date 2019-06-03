import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author yuyz
 * @date 2019-03-20 20:38
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception{
        FileChannel in = new
                FileInputStream("E:\\ThinkingJava\\io\\src\\read").getChannel();
        FileChannel out = new
                FileOutputStream("E:\\ThinkingJava\\io\\src\\write").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        //每次read()操作之后,就会将数据输入到缓冲器中,filp()则是准备缓冲器,以便它的信息可以有write()提取
        //write()操作之后,信息仍在缓冲器中,接着clear()操作则对所有的内部指针重新安排以便缓冲器在另一个read()操作期间能够做好接受数据的准备.
//        while(in.read(buffer) != -1) {
//            buffer.flip();
//            out.write(buffer);
//            buffer.clear();
//        }
        //特殊方法transferTo(position, count, src)和transferFrom(src, position, count)允许我们将一个通道和另一个通道直接相连.
//        out.transferFrom(in, 0, in.size());
        in.transferTo(0, in.size(), out);

    }
}
