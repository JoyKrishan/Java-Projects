package com.JoyKrishanDas.stack;
import com.JoyKrishanDas.Person;
import java.lang.annotation.Retention;

public class PersonStack {
    private Person[] stack;
    private int top;
    private int size;

    // Default stack of size 10
    public PersonStack(){
        top = -1;  // Initially top is -1 because stack is empty
        size = 10;
        stack = new Person[size];
    }

    // Intialise with user-defined stack size
    public PersonStack(int size){
        top = -1;
        this.size = size;
        stack = new Person[this.size];
    }

    public boolean push(Person item){
        if (!isFull()){
            top+=1;
            stack[top]= item;
            return true;
        }
        return false;
    }

    public Person pop(){
        return stack[top--];
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
