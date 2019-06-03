import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author yuyz
 * @date 2019-03-18 21:36
 */
public class BufferedInputFile {
    public static String read(String filename) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("E:\\ThinkingJava\\io\\src\\" + filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println(read("BufferedInputFile.java"));
    }
}
