package com.nikhil.DsaPatterns.SlowAndFastPointer;

public class LL {

    public Node head;
    public Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    public static class Node {
    
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{value=" + value + "}";
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    
    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++; 
    }

    // Insert using recursion....
    public void insertWithRecursion(int val, int index){
        head = insertRec(val, index, head);
    }

    public Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size){
            return deleteLast();
        }

        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
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

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }

    public void bubbleSort(int row, int col){
        if(row==0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value){

                // swap...
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            bubbleSort(row, col+1);
        }
        else{
            bubbleSort(row-1, 0);
        }
    }
}
