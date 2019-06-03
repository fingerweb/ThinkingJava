import java.io.*;

/**
 * @author yuyz
 * @date 2019-03-20 16:31
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.txt";

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("read")));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        System.out.println("写入");
        String s;
        while((s = in.readLine()) != null)
            out.write(lineCount++ +": " + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
