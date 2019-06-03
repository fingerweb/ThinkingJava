package util;

import java.util.*;

/**
 * @author yuyz
 * @date 2019-01-15 9:41
 */
public class New {
    public static <K,T> Map<K,T> map() {
        return new HashMap<K,T>();
    }
    public static <T> List<T> list() {
        return new ArrayList<T>();
    }
    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }
    public static <T> Set<T> set() {
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
        List<String> list = New.list();
        LinkedList<String> linkedList = New.lList();
    }
}
