package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDsa {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Queue1");
        queue.offer("Queue2");
        queue.offer("Queue3");
        queue.offer("Queue4");
        queue.offer("Queue5");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
