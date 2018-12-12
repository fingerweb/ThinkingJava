package filters;

/**
 * @author yuyz
 * @date 2018-10-31 9:14
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
}
