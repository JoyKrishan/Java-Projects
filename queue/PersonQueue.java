package com.JoyKrishanDas.queue;
import com.JoyKrishanDas.Person;


public class PersonQueue {
    private Person[] queue;
    private int rear;  // it is used to enqueue
    private int front; // it is used to dequeue
    private int size;
    private int total;

    public PersonQueue(){
        queue = new Person[10];
        rear = 0;
        front = 0;
        size = 10; // default size is 10
        total = 0;
    }

    public boolean enqueue(Person item){
        if (!isFull()) {
            total += 1;
            queue[rear] = item;
            rear = (rear + 1) % size;
            return true;
        }
        return false;
    }

    public Person dequeue(){
        total -= 1;
        Person deq = queue[front];
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
