package com.JoyKrishanDas.HashTable;

import com.JoyKrishanDas.Student;

public class StdList {
    private Node head;

    class Node {
        private Student item;
        private Node next;
    }

    public StdList() {
        head = new Node();
        head.item = null;
        head.next = null;
    }

    public void insert(Student student) {
        Node n = new Node();
        n.item = student;
        n.next = head.next;
        head.next = n;
    }

    public boolean haveRollNo(String rollNo) {
        boolean have = false;
        if (head.next == null) {
            return false;
        } else {
            Node curr = head.next;
            while (curr != null) {
                if (curr.item.getRollNo().equals(rollNo)) {
                    have = true;
                    break;
                }
                curr = curr.next;
            }
        }
        return have;
    }

    public Student fetchData(String rollNo) {
        Student newStudent = null;
        Node curr = head.next;
        while (curr != null) {
            if (curr.item.getRollNo().equals(rollNo)) {
                newStudent = curr.item;
                break;
            }
            curr = curr.next;
        }
        return newStudent;
    }

    public void deleteStudent(String rollNo) {
        Node x = head.next;
        Node y = x.next;
        while (y == null || y.item.getRollNo().equals(rollNo)) {
            x = y;
            y = y.next;
        }
        if (y != null) {
            x.next = y.next;
        }
    }

    public String showAll() {
        StringBuffer buff = new StringBuffer();
        Node curr = head.next;
        while (curr != null) {
            buff.append(curr.item);
            curr = curr.next;
        }
        return buff.toString();
    }

}
