import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * @author yuyz
 * @date 2019-03-20 21:31
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    private static final String filePath = "E:\\ThinkingJava\\io\\src\\write";
    //ByteBuffer缓冲器容纳的是普通字节,为了把他们转换成字符,我们要么在输入它们的时候对其进行编码(这样,输出时才具有意义)
    //要么在将其从缓冲器输出时对它们进行解码.
    public static void main(String[] args) throws Exception{
        FileChannel fc =
                new FileOutputStream(filePath).getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap(" BufferrToText".getBytes("UTF-16")));
        fc.close();

        fc = new FileInputStream(filePath).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        //Don't work
        System.out.println(buff.asCharBuffer());
        //Decode using this system's default Charset
        /*
         * rewind()方法.将ByteBuffer.position = 0;ByteBuffer.mark = -1;
         */
        buff.rewind();
        //file.encoding的值保存的是每个程序的main的入口的那个java文件的保存编码,是.java文件的编码.
        String encoding = System.getProperty("file.encoding");
        //Charset.forName()用来产生Charset对象,可以用它对字符串进行解码.
        System.out.println("Decoded using " + encoding + ":"
            + Charset.forName(encoding).decode(buff));
        //or, we could encode with something that will print:
        fc = new FileOutputStream(filePath).getChannel();
        fc.write(ByteBuffer.wrap(" UTF-16BE".getBytes("UTF-16")));
        fc.close();

        //Now try reading again:
        fc = new FileInputStream(filePath).getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        //use a CharBuffer to write through
        fc = new FileOutputStream(filePath).getChannel();
        //为ByteBuffer分配24个字节,一个字符需要2个字节,那么buff能够保存12个字符.
        buff = ByteBuffer.allocate(24);
        //向buff中放入"CharBuffer",10个字符.
        //输出buff,剩余的内容为零(还有4个字节)仍出现由它的toString()所产生的CharBuffer的表示中,在输出中可以看到"空格".
        buff.asCharBuffer().put("CharBuffer");
        fc.write(buff);
        fc.close();
        //Read and display
        fc = new FileInputStream(filePath).getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
}
