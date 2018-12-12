package stack;

import java.util.AbstractCollection;
import java.util.LinkedList;

/**
 * 用LinkedList构建栈
 * @author yuyz
 * @date 2018-11-11 19:01
 */
public class Stack<T> {
    private LinkedList<T> storage;
    public Stack() {
        storage = new LinkedList<T>();
    }
    public void push(T t){
        storage.addFirst(t);
    }
    public T peek() {
        return  storage.getFirst();
    }
    public T pop() {
        return storage.removeFirst();
    }
    public boolean isEmpty() {
        return storage.size() == 0;
    }
    public String toString() {
        return storage.toString();
    }
}