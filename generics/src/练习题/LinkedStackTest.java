package 练习题;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @author yuyz
 * @date 2019-01-14 11:16
 */
public class LinkedStackTest<T> {
    class Node<U> {
        U type;
        Node<U> next;
        public Node() {
            type = null;
            next = null;
        }
        public Node(U type, Node<U> next) {
            this.type = type;
            this.next = next;
        }
        boolean end() {
            return type == null && next == null;
        }
    }
    Node<T> top = new Node<T>();
    public void push(T type) {
        top = new Node(type, top);
    }
    public T pop() {
        T result = top.type;
        if(! top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStackTest<String> l = new LinkedStackTest<String>();
        for(String str : "Here there you I".split("\\s"))
            l.push(str);
        while(!l.top.end()){
            System.out.println(l.pop());
        }
    }

}
