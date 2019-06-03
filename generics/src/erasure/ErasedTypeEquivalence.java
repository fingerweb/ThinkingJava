package erasure;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * @author yuyz
 * @date 2019-01-16 10:55
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c2 == c2);
    }
}
