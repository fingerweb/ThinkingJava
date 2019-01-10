import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @author yuyz
 * @date 2018-12-28 21:50
 */
public class ThreatAnalyzer {
    static String threatData =
            "58.27.82.161@02/11/2005\n" +
            "56.27.82.141@02/11/2005\n" +
            "58.27.42.131@12/11/2005\n" +
            "58.24.82.161@22/12/2005\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"
                + "(\\d{2}/\\d{2}/\\d{4})";
        while(scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}
