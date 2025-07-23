package com.Stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Inbuilt {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(80);
        deque.addLast(78);
        deque.removeFirst();
    }
}
