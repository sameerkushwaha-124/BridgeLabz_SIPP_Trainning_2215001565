class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println("Node with data " + data + " found.");
                return;
            }
            temp = temp.next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }
}

public class Main{
    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtFirst(10);
        dl.insertAtFirst(20);
        dl.insertAtEnd(30);
        dl.search(10); 
        dl.search(30); 

        dl.display();
    }
}
