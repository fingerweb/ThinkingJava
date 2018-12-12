package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author yuyz
 * @date 2018-11-15 12:08
 */
public class QueueDemo {
    public static void printQueue(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random(47);
        System.out.println("入队列的顺序: ");
        for(int i = 0; i < 10; i++){
            int num = random.nextInt(i + 10);
            queue.offer(num);
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("出队列的数序:");
        QueueDemo.printQueue(queue);
    }
}
