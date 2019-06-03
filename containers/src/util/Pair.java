package util;

/**
 * @author yuyz
 * @date 2019-01-16 21:55
 */
public class Pair<K, V> {
    public final K key;
    public final V value;
    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
