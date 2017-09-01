package com.discardpast.queue;

/**
 * Created by discardpast on 17-8-23.
 */
public class Queue {
    //队列容量
    private int queue_Capacity;
    //队列长度
    private int queue_Length;
    //队列数组
    private int[] queue_Array;
    //队列指针
    private int queue_Pot;
    //队列头
    private int queue_Head;
    //队列尾
    private int queue_Tail;

    //新建一个队列
    public Queue(int Capacity){
        queue_Capacity = Capacity;
        queue_Array = new int[queue_Capacity];
        ClearQueue();
    }
    //清空一个队列
    public void ClearQueue()
    {
        queue_Head = 0;
        queue_Tail = 0;
        queue_Length = 0;
        queue_Pot = 0;
    }
    //判断队列是否为空
    public boolean IsEmptyQueue()
    {
        if(queue_Length == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //判断队列是否有空位
    public boolean IsHaveEmptyPot()
    {
        if(queue_Length < queue_Capacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //判断队列是否为满
    public boolean IsFullQueue()
    {
        if(queue_Length == queue_Capacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //队列长度
    public int QueueLength()
    {
        return queue_Length;
    }
    //向队列插入一个元素
    public void EnQueue(int element)
    {
        if(IsHaveEmptyPot() || IsEmptyQueue()) {
            queue_Array[queue_Pot] = element;
            queue_Pot++;
            queue_Pot = queue_Pot % queue_Capacity;
            queue_Tail++;
            queue_Tail = queue_Tail % queue_Capacity;
            queue_Length++;
        }
        else
        {
            System.out.println("队列满员,无法插入元素!");
        }
    }
    //从队列删除一个元素
    public void DeQueue(int element_pot)
    {

        if(IsHaveEmptyPot() || IsFullQueue())
        {
            for (int element:queue_Array)
            {
                int i =0;
                i++;
                if(element == element_pot)
                {
                    queue_Array[i] = 0;
                }
            }
        }
    }
    //遍历队列
    public void TraverseQueue()
    {
        for (int element:queue_Array)
        {
            System.out.println(element);
        }
    }
}
