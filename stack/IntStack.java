package com.JoyKrishanDas.stack;

import java.lang.annotation.Retention;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    // Default stack of size 10
    public IntStack(){
        top = -1;  // Initially top is -1 because stack is empty
        size = 10;
        stack = new int[size];
    }

    // Intialise with user-defined stack size
    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean push(int item){
        if (!isFull()){
        top+=1;
        stack[top]= item;
        return true;
        }
        return false;
    }

    public int pop(){
        return stack[top--];
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
