package com.JoyKrishanDas;
import com.JoyKrishanDas.BST.IntBST;
import com.JoyKrishanDas.HashTable.Hashtable;
import com.JoyKrishanDas.linkedList.IntDoublyLinkedList;
import com.JoyKrishanDas.linkedList.IntLinkedList;
import com.JoyKrishanDas.linkedList.PersonLinkedList;
import com.JoyKrishanDas.queue.IntQueue;
import com.JoyKrishanDas.ImplementStack;
import com.JoyKrishanDas.queue.PersonQueue;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  //ImplementStack.implementStack();
        IntQueue q1 = new IntQueue();

        // Implementing IntQueue
        q1.enqueue(8);
        q1.enqueue(9);
        q1.enqueue(10);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());

        // Implementing PersonQueue
        PersonQueue pq1 = new PersonQueue();
        Person p1 = new Person("Joy Krishan Das", 100);
        Person p2 = new Person("Ahnaf Alvee", 200);
        pq1.enqueue(p1);
        pq1.enqueue(p2);
        System.out.println(pq1.dequeue());*/


        // Implementation of Singly Linked List from here onwards
        IntLinkedList list1 = new IntLinkedList(1);
        list1.insert(9);
        list1.insert(1);
        list1.insert(4);
        list1.insert(7);
        list1.insert(7);
        list1.insert(2);
        list1.insert(5);
/*      System.out.println("Print before deleting anything");
        list1.printList();
        // delete 3
        list1.delete(3);
        list1.delete(4);
        System.out.println("Print after deleting");
        list1.printList();*/
    /*    System.out.println("Before Sorting: "+list1);
        list1.sortList();
        System.out.println("After Sorting: "+list1);

        Person p1 = new Person("Joy Krishan Das", 100);
        Person p2 = new Person("Ahnaf Alvee", 400);
        Person p3 = new Person("Zebel Akhand", 300);
        Person p4 = new Person("Dhrubo", 150);
        PersonLinkedList pList = new PersonLinkedList(p1);
        pList.insert(p2);
        pList.insert(p3);
        pList.insert(p4);
        System.out.println("Before Sorting: "+pList);
        pList.sortList();
        System.out.println("After Sorting: "+pList);*/

     /*   // Implementation of the Doubly Linked List from here on
        IntDoublyLinkedList doublyList = new IntDoublyLinkedList(5);
        doublyList.insert(6);
        doublyList.insert(8);
        doublyList.insert(2);
        doublyList.insert(5);
        doublyList.insert(9);
        doublyList.delete(2);
        doublyList.delete(9);
        doublyList.printList();*/

        // Implementation of IntBST from here on
        IntBST bst = new IntBST();
        bst.insert(5);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(0);
        bst.insert(10);
        bst.inOrder(bst.getRoot());
        System.out.println();
        System.out.println(bst.findNode(6));
        System.out.println(bst.findNode(10));
        System.out.println(bst.findNode(50));
        System.out.println(bst.findParent(10));


        // Implementation of the HashTable goes from here
        Hashtable tb = new Hashtable();
        Student s1 = new Student("Joy", "92", 3.92);
        Student s2 = new Student("Alvee", "1", 3.62);
        Student s3 = new Student("Zebel", "10", 3.42);
        Student s4 = new Student("Arko", "6", 3.52);
        Student s5 = new Student("Fahim", "6", 3.12);

        System.out.println(tb.hashcode(s1.getRollNo()));
        tb.insert(s1);
        tb.insert(s2);
        tb.insert(s3);
        tb.insert(s4);
        tb.insert(s5);
        System.out.println(tb.showTotal());
        tb.showData();

    }
}