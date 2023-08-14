package br.com.xti.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {

        // FIFO
        Queue<String> queue = new LinkedList<>();
        queue.add("Luna");
        queue.offer("Nebulosa");
        queue.add("How");
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        // Another available methods
        LinkedList<String> linkedList = (LinkedList<String>) queue;
        linkedList.addFirst("Hermione"); // add to beginning
        linkedList.addLast("Luna"); // add to ending
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.pollFirst();
        linkedList.pollLast();

        System.out.println(linkedList);

    }
}
