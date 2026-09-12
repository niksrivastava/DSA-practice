package com.nikhil.LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {

            if(node.value == value){
                return node;
            }
            
            node = node.next;
            
        }
        return null;
    }

    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.previous = p;
        if(node.next != null){
            node.next.previous = node;
        }     
        else {
            tail = node;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(head != null){
            head.previous = node;
        }
        else{
            tail = node;
        }
        node.previous = null;
        head = node;
        size += 1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.previous = tail;
        if(tail != null){
            tail.next = node;
        }
        else{
            head = node;
        }
        node.next = null;
        tail = node;
        size++;
    }

    public void display(){
        Node node = head;
        System.out.print("Null <- ");
        while(node != null){

            System.out.print(node.value);

            if (node.next != null) {
            System.out.print(" <-> ");
        }
            node = node.next;
        }
        System.out.print(" -> Null");
    }

    public void displayReverse(){
        Node node = tail;
        System.out.print("Null <- ");
        while(node != null){

            System.out.print(node.value);

            if (node.previous != null) {
            System.out.print(" <-> ");
        }
            node = node.previous;
        }
        System.out.print(" -> Null");
    }


    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int val){
            this.value = val;
        }

        public Node(int value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
