package com.Stacks_queues;

public class queueMain {
    public static void main(String[] args) throws Exception {
        circularqueuecustom queue = new circularqueuecustom ();
        queue.insert(3);
        queue.insert(6);
        queue.insert(13);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}
