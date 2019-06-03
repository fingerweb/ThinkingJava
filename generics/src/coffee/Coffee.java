package coffee;

/**
 * @author yuyz
 * @date 2019-01-14 18:56
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
