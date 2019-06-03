import java.io.StringReader;

/**
 * @author yuyz
 * @date 2019-03-20 15:58
 */
public class MemoryInput {
    public static void main(String[] args) throws Exception{
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while((c = in.read()) != -1)
            System.out.println((char) c);
    }
}
