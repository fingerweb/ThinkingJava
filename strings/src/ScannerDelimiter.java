import java.util.Scanner;

/**
 * @author yuyz
 * @date 2018-12-29 15:58
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}