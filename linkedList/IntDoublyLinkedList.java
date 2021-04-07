package com.JoyKrishanDas.linkedList;

public class IntDoublyLinkedList {
    private Node head;

    class Node {
        private int value;
        private Node prev;
        private Node next;
    }

    public IntDoublyLinkedList(int item){
        head = new Node();
        head.value = item;
        head.prev = null;
        head.next = null;
    }

    public boolean insert(int item) {
        Node n = new Node();
        n.value = item;
        n.next = head;
        head.prev = n;
        head = n;
        return true;
    }

    public boolean delete(int item) {
        if (head.value == item) {
            head = head.next;
            head.prev = null;
            return true;
        } else {
            Node x = head;
            Node y = head.next;
            while (true) {
                if (y == null || y.value == item) {
                    break;
                } else {
                    x = y;
                    y = y.next;
                }
            }
            if (y != null) {
                x.next = y.next;
                y.next.prev = x;
                return true;
            }
            return false;
        }
    }



    public void printList(){
        Node curr = head;
        while(curr.next != null){
            System.out.println(curr.value);
            curr = curr.next;
        }
        System.out.println(curr.value);
    }


}
