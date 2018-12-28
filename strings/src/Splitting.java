import java.util.Arrays;

/**
 * @author yuyz
 * @date 2018-12-26 14:37
 */
public class Splitting {
    private static void split(String regex) {
        String knights = "Then, when you have found the shrubbery, you must "
                + "cut down the mightiest tree in the forest.. " + "with ... a herring!";
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}
