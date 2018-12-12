package filters;

/**
 * @author yuyz
 * @date 2018-10-31 9:13
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
}
