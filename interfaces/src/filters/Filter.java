package filters;

/**
 * @author yuyz
 * @date 2018-10-31 9:08
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input ) {
        return input;
    }
}
