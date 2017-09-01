#ifndef MYQUEUE_H
#define MYQUEUE_H

class MyQueue
{
public:
    MyQueue(int queueCapacity); //InitQueue(&Q) create queue
    virtual ~MyQueue();         //DestroyQueue(&Q) destory queue
    void ClearQueue();            //ClearQueue(&Q) clear queue
    bool QueueEmpty() const;      //QueueEmpty(Q) is empty queue
    bool QueueFull() const;       //QueueFull(Q) is full queue
    int QueueLength() const;      //QueueLength(Q) queue length
    bool EnQueue(int element);    //EnQueue(&Q,element) new element into queue
    bool DeQueue(int &element);   //DeQueue(&Q,&element) first element outto queue
    void QueueTraverse();         //QueueReaverse(Q, visit()) traverse queue
private:
    int *m_pQueue;                //queue array pot
    int m_iQueueLen;              //queue element number
    int m_iQueueCapacity;         //queue array capacity
    int m_iHead;
    int m_iTail;
};

#endif // MYQUEUE_H
