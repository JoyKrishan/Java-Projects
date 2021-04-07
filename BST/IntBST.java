package com.JoyKrishanDas.BST;


public class IntBST {
    private Node root;

    class Node {
        private int value;
        private Node right;
        private Node left;
    }

    public IntBST() {
        root = null;
    }

    public boolean insert(int item) {
        Node n = new Node();
        n.value = item;
        n.left = null;
        n.right = null;

        Node x = root;
        Node y = null;

        while (x != null) {
            y = x;
            if (item <= x.value) x = x.left; // leftChild
            else x = x.right;  //rightChild
        }

        if (y == null) {  // It is the first node
            root = n;
        } else if (y.value > item) { //left
            y.left = n;
        } else {
            y.right = n;
        }
        return true;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }


    public boolean findNode(int item) {
        if (root == null) {
            return false;
        } else {
            Node curr = root;
            Node found = null;
            while (curr != null) {
                if (item == curr.value) {
                    found = curr;
                    break;
                }
                if (item < curr.value) curr = curr.left;
                else curr = curr.right;
            }
            if (found != null) return true;
            else return false;
        }
    }

    public String findParent(int item) {
        if (root == null || root.value == item) {
            return "No Parent";
        } else {
            Node x = root;
            Node parent = null;
            Node y = null;
            while (x != null) {
                if (x.value == item) {
                    parent = y;
                    break;
                }
                y = x;
                if (item < x.value) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
            if (parent != null) {
                return "Parent found :" + parent.value;
            } else
                return "No parent";
        }
    }


    public Node getRoot() {
        return root;
    }

    public int getRootValue() {
        return root.value;
    }
}
