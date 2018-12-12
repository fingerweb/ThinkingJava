package filters;

/**
 * @author yuyz
 * @date 2018-10-31 9:09
 */
public class Waveform {
    private static int counter;
    private final int id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}
