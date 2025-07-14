// BookShelf – Library Organizer (HashMap + Linked List)
// Story: In a library system, books are arranged based on genre and author. A HashMap maps
// genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or
// returned.
// Requirements:
// ● Maintain genre-wise catalog.
// ● Efficient insert, delete using LinkedList.
// ● Avoid duplication using HashSet.

class Node{
    String bookName;
    String author;
    Node next;

    Node(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.next = null;
    }
}

class User{
    String name;
    String email;
    private Node borrowedBooks;
    private Node returnedBooks;
    User(String name, String email){
        this.name = name;
        this.email = email;
        this.borrowedBooks = null;
        this.resturnedBooks = null;
    }
}

class LibraryOrganizer{
    private HashMap<User, Node> associatedBookWithUser;
    private HashSet<Node> bookSet;

    LibraryOrganizer() {
        this.associatedBookWithUser = new HashMap<>();
        this.bookSet = new HashSet<>();
    }
}



public class Main{
    public static void main(String args[]){

    }
}