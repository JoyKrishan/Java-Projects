package com.JoyKrishanDas.linkedList;
import com.JoyKrishanDas.Person;
public class PersonLinkedList {
    private Node head;

    class Node {
        private Person person;
        private Node link;
    }

    public PersonLinkedList(Person item) {
        head = new Node();
        head.person = item;
        head.link = null;
    }

    public boolean insert(Person item) {
        Node n = new Node();
        /*n.value = item;
        n.link = head;
        head = n;
        return true;*/
        Node curr = head;
        while (curr.link != null) {
            curr = curr.link;
        }
        n.person = item;
        n.link = null;
        curr.link = n;
        return true;
    }

    public void printList() {
        Node current = head;
        while (current.link != null) {
            System.out.println(current.person);
            current = current.link;
        }
        System.out.println(current.person);
    }

    public boolean delete(Person item) {
        if (head.person == item) {
            head = head.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while (true) {
                if (y == null || y.person == item) {
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

    public void sortList() {  // Sorting the LinkedList using BubbleSort Based on the Person's score
        Person temp;
        Node curr = head;
        while (curr.link != null) {
            Node next = curr.link;
            while (next != null) {
                if (curr.person.getScore()< next.person.getScore()) {
                    temp = curr.person;
                    curr.person = next.person;
                    next.person = temp;
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
            list.append(curr.person.getName()+ ", ");
            curr = curr.link;
        }
        list.append(curr.person.getName()+"]");
        return list.toString();
    }

}
