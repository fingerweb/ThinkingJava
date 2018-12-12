package filters;

/**
 * @author yuyz
 * @date 2018-10-31 9:15
 */
public class BandPass extends Filter {
    double lowCutoff, HighCutoff;
    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.HighCutoff = highCutoff;
    }
}
