package util;

import java.util.LinkedHashMap;

/**
 * @author yuyz
 * @date 2019-01-16 21:57
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> gen, int quanlity) {
        for(int i = 0; i < quanlity; i++) {
            Pair<K, V> pair = gen.next();
            put(pair.key, pair.value);
        }
    }
    public MapData(Generator<K> genK, Generator<V> genV, int quanlity) {
        for(int i = 0; i < quanlity; i++) {
            K key = genK.next();
            V value = genV.next();
            put(key, value);
        }
    }
    public MapData(Generator<K> genK, V value, int quanlity) {
        for(int i = 0; i < quanlity; i++) {
            K key = genK.next();
            put(key, value);
        }
    }
    public MapData(Iterable<K> k, Generator<V> v) {
        for(K key : k)
            put(key, v.next());
    }
    public MapData(Iterable<K> k, V value) {
        for(K key : k)
            put(key, value);
    }


    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quanlity) {
        return new MapData(gen, quanlity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quanlity) {
        return new MapData(genK, genV, quanlity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quanlity) {
        return new MapData(genK, value, quanlity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> k, Generator<V> v) {
        return new MapData(k, v);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> k, V value) {
        return new MapData(k, value);
    }
}
