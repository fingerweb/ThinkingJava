import java.util.EnumSet;
import java.util.Set;
import watercolors.*;
import static watercolors.WaterColors.*;
/**
 * @author yuyz
 * @date 2019-01-15 15:38
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println(("set1: " + set1));
        System.out.println(("set2: " + set2));
    }
}

