package com.JoyKrishanDas.queue;

public class IntQueue {
    private int[] queue;
    private int rear;  // it is used to enqueue
    private int front; // it is used to dequeue
    private int size;
    private int total;

    /* rear and front keep on increasing but it should come to
       zero when all the values are dequeued */

    public IntQueue(){
        queue = new int[10];
        rear = 0;
        front = 0;
        size = 10; // default size is 10
        total = 0;
    }

    public boolean enqueue(int item){
        if (!isFull()) {
            total += 1;
            queue[rear] = item;
            rear = (rear + 1) % size;
            return true;
        }
        return false;
    }

    public int dequeue(){
        total -= 1;
        int deq = queue[front];
        front = (front + 1) % size;
        return deq;
    }

    public boolean isEmpty(){
        return total == 0;
    }

    public boolean isFull(){
        return total == size;
    }

}
