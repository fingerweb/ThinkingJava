import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * @author yuyz
 * @date 2019-03-21 12:40
 */
public class UsingBuffers {
    //这个方法交换CharBuffer中相邻的字符.
    private static void symmetricScramble(CharBuffer buffer) {
        while(buffer.hasRemaining()) {
            //将mark设置为position
            buffer.mark();

            char c1 = buffer.get();
            char c2 = buffer.get();
            /*
             * reset()将position = mark;
             */
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char [] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length << 1);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
    }
}
