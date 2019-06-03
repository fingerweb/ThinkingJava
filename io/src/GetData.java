import java.nio.ByteBuffer;

/**
 * @author yuyz
 * @date 2019-03-20 22:16
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        //在分配一个ByteBuffer之后,ByteBuffer中的值都会自动置零.
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        //allocation automatically zeroes the ByteBuffer:
        int i = 0;
        while(i++ < bb.limit())
            if(bb.get() != 0)
                System.out.println("nonzero");
        System.out.println("i = " + i);
        bb.rewind();

        //Store and read a char array:
        bb.asCharBuffer().put("Howdu");

        char c;
        while((c = bb.getChar()) != 0)
            System.out.print(c + " ");
        System.out.println();

        bb.rewind();
        //store and read a short
        bb.asShortBuffer().put((short)471142);
        System.out.println(bb.getShort());
        System.out.println(bb);
        //store and read an int/long/float/double等基本类型省略了.
    }
}
