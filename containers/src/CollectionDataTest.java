import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import util.CollectionData;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuyz
 * @date 2019-01-16 21:42
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(
                new CollectionData<String>(new Government(), 15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
