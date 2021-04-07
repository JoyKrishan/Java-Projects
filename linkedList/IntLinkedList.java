package com.JoyKrishanDas.linkedList;

public class IntLinkedList {
    private Node head;

    class Node {
        private int value;
        private Node link;
    }

    public IntLinkedList(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    public boolean insert(int item) {
        Node n = new Node();
        /*n.value = item;
        n.link = head;
        head = n;
        return true;*/
        Node curr = head;
        while (curr.link != null) {
            curr = curr.link;
        }
        n.value = item;
        n.link = null;
        curr.link = n;
        return true;
    }

    public void printList() {
        Node current = head;
        while (current.link != null) {
            System.out.println(current.value);
            current = current.link;
        }
        System.out.println(current.value);
    }

    public boolean delete(int item) {
        if (head.value == item) {
            head = head.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while (true) {
                if (y == null || y.value == item) {
                    break;
                }
                x = y;
                y = y.link;
            }
            if (y != null) { // value found if y has a node
                x.link = y.link;
                return true;
            }
            return false;
        }
    }

    public void sortList() {  // Sorting the LinkedList using BubbleSort
        int temp = 0;
        Node curr = head;
        while (curr.link != null) {
            Node next = curr.link;
            while (next != null) {
                if (curr.value < next.value) {
                    temp = curr.value;
                    curr.value = next.value;
                    next.value = temp;
                }
                next = next.link;
            }
            curr = curr.link;
        }
    }

    public int length(){
        int count = 0;
        Node curr = head;
        while( curr.link != null){
            count ++;
            curr = curr.link;
        }
        return count;
    }

    public String toString(){
        StringBuffer list = new StringBuffer();
        list.append("[");
        Node curr = head;
        while(curr.link != null){
            list.append(curr.value+ ", ");
            curr = curr.link;
        }
        list.append(curr.value+"]");
        return list.toString();
    }

}
