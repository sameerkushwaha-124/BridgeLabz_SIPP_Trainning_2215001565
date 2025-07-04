class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedList {

    private ListNode head; // Declare the head pointer
    public void addFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;        
    }

    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void delete(int val){
        ListNode curr = head;
        while(curr.next != null && curr.next.val != val){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        
        // System.out.println(curr.val);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for (int i = 0; i < 10; i++) {
            ll.insert(i);
        }
        
        ll.print();
        ll.addFirst(90);
        ll.print();
        ll.delete(5);
        ll.print();
        ll.delete(9);
        ll.print();

    }
}
