package LinkedList;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("Head");
        }
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node != head);
    }


    private class Node {
    
        private int value;
        private Node next;

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
}
