package util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yuyz
 * @date 2019-01-16 21:34
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quality) {
        for(int i = 0; i < quality; i++)
            add(gen.next());
    }
    public static <T> CollectionData<T> list(Generator<T> gen, int quality) {
        return new CollectionData<T>(gen, quality);
    }
}
