package br.com.brunadelmouro.youtube.MCollections.test.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("C");
        q.add("D");
        q.add("A");
        q.add("B");
        System.out.println(q);

//        System.out.println(q.peek());
//        System.out.println(q.remove("B"));
//        System.out.println(q.size());
//        System.out.println(q.offer());

    }
}
