package com.JoyKrishanDas;
import  com.JoyKrishanDas.stack.IntStack;
import com.JoyKrishanDas.stack.PersonStack;

import java.util.Scanner;

public class ImplementStack {

    public static void implementStack() {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack();
        PersonStack perStack = new PersonStack();
        System.out.println("Play with IntegerStack or ObjectStack ?");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("integerstack")) funcIntStack(stack, sc);
        else{
            Person p1 = new Person("Joy Krishan Das", 100);
            Person p2 = new Person("Ahnaf Alvee", 200);
            Person p3 = new Person("Zebel", 150);
            perStack.push(p1);
            perStack.push(p2);
            System.out.println(perStack.pop());
        }

    }


    public static void funcIntStack(IntStack stack, Scanner sc) {
        System.out.print("Do you want to push : ");
        String in = sc.nextLine();
        if (in.equalsIgnoreCase("yes")) {
            if (stack.isFull()) System.out.println("Stack is Full");
            while (!stack.isFull()) {
                System.out.print("Push: ");
                stack.push(sc.nextInt());
                sc.nextLine();
                if (stack.isFull()) {
                    System.out.println("Stack is Full");
                } else {
                    System.out.println("Do you want to push more? ");
                    if (sc.nextLine().equalsIgnoreCase("yes")) continue;
                    else break;
                }
            }
        }
        System.out.print("Do you want to pop : ");
        String in2 = sc.nextLine();
        if (in2.equalsIgnoreCase("yes")) {
            if (stack.isEmpty()) System.out.println("Stack is Empty");
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
                if (stack.isEmpty()) {
                    System.out.println("Stack is Empty");
                } else {
                    System.out.println("Do you want to pop more? ");
                    if (sc.nextLine().equalsIgnoreCase("yes")) continue;
                    else break;
                }
            }

        }
        System.out.println("Done");
        }

    }

