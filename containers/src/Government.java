import util.Generator;

/**
 * @author yuyz
 * @date 2019-01-16 21:38
 */
public class Government implements Generator<String> {
    String[] fountion = ("It is the quality of one's convictions that determines success, not the number of followers").split(" ");
    private int x = 0;
    public String next() {
        return fountion[x++];
    }
}
