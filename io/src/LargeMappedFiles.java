import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author yuyz
 * @date 2019-03-21 13:57
 */
public class LargeMappedFiles {
    static int length =0x8FFFFFF;
    private static final String FILEPATH = "E:\\ThinkingJava\\io\\src\\readAndWrite";
    public static void main(String[] args) throws Exception{
        /*
         *FileChannel.map(MapMode mode,long position, long size)
         * mode:文件的读写权限, position:指定映射文件的初始位置; size:映射文件的长度.
         */
        MappedByteBuffer out =
                new RandomAccessFile(FILEPATH, "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        for(int i = 0; i < length; i++)
            out.put((byte)'c');
        System.out.println("Finished writing");
        for(int i = length >> 1; i < length >> 1 + 6; i++)
            System.out.println((char)out.get(i));

    }
}
