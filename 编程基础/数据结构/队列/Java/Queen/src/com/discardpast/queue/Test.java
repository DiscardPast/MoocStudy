package com.discardpast.queue;

/**
 * Created by discardpast on 17-8-23.
 */
public class Test {
    static Queue queue;
    public static void main(String[] args)
    {
        queue = new Queue(4);
        queue.EnQueue(26);
        queue.EnQueue(22);
        queue.EnQueue(25);
        queue.EnQueue(26);
        queue.DeQueue(25);
        queue.EnQueue(26);
        System.out.println(queue.QueueLength());
        queue.TraverseQueue();
    }
}
