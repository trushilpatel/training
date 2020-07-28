package Learn.collectionExamples;

import java.awt.*;
import java.util.PriorityQueue;

public class proorityQueuePrac {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.forEach(System.out::println);
        pq.offer(5);
        System.out.println("after offer");
        pq.forEach(System.out::println);

        System.out.println(pq.peek());

    }

}
