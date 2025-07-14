// Scenario 1: Browser History Navigation
// Use Case: Maintain a user’s browsing history with the ability to move back and forth.
// Why LinkedList? Doubly linked list makes it easy to navigate both backward and forward.
// OOP Concepts:
// ● Encapsulation: Browser history data is wrapped inside a class.
// ● Abstraction: Navigation methods hide internal implementation.
// ● Inheritance & Polymorphism: Reusable navigation for other apps like music players.

abstract class Navigation{
    abstract void goBack();
    abstract void goForward();
}

class Node{
    String url; 
    Node next;
    Node prev;

    Node(String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory extends Navigation{
    private Node browserHead;
    private Node current;
    private Node browserTail;

    BrowserHistory() {
        this.browserHead = null;
        this.current = null;
        this.browserTail = null;
    }

    public void visit(String url){
        Node newNode = new Node(url);
        if (browserHead == null) {
            browserHead = newNode;
            current = newNode;
            browserTail = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
            browserTail = current; 
        }
    }

    public void toVisitAt(String url){
        Node temp = browserHead;
        while(temp != null){
            String link = temp.url;
            if(link.equals(url)){
              
                if (temp.prev != null) {
                    temp.prev.next = temp.next; 
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev; 
                }
                if (temp == browserHead) {
                    browserHead = temp.next; 
                }
                current = temp; 
                current.next = null; 
                current.prev = browserTail; 
                if (browserTail != null) {
                    browserTail.next = current;
                }
                browserTail = current; 
                System.out.println("Visited: " + url);
                return;
            } 
            temp = temp.next;
        }
    }

    public void goBack(){
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Going back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward(){
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Going forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public void displayHistory(){
        Node temp = browserHead;
        while(temp != null){
            System.out.println(temp.url);
            temp = temp.next;
        }
    }

    public void setToLastVisitURL(){
        if (browserTail != null) {
            current = browserTail;
            System.out.println("Set to latest URL: " + current.url);
        } else {
            System.out.println("No history available.");
        }
    }
}

class Main{

    public static void main(String[] args){
        BrowserHistory bh = new BrowserHistory();
        bh.visit("https://www.google.com");
        bh.visit("https://www.facebook.com");
        bh.visit("https://www.twitter.com");
        bh.visit("https://www.linkedin.com");
        bh.visit("https://www.github.com");
        bh.visit("https://www.stackoverflow.com");

        
        // bh.displayHistory();
        // bh.toVisitAt("https://www.twitter.com");
        bh.displayHistory();
        
        // bh.goBack(); 
        // bh.goForward(); 
        // bh.goBack();
        // bh.goBack(); 
        // bh.goBack();

        // bg.setToLastVisitURL();
        
    }
}