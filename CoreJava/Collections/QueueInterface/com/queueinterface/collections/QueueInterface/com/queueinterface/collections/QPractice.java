package QueueInterface.com.queueinterface.collections;

import java.util.PriorityQueue;

public class QPractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.offer(1);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.contains(30));
    }
}
