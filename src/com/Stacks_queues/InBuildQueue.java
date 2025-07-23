package com.Stacks_queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(13);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
