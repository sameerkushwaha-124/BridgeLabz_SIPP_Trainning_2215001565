// Library Book System: Create a Book class with attributes title, author, price,
//  and availability. Implement a method to borrow a book.
import java.util.*;
class Book{
    String title;
    String author;
    double price;
    boolean availability;
    public Book(String title, String author, double price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public void borrowBook(){
        if(availability){
            availability = false;
        }
    }
}
public class LibraryBookSystem {
    List<Book> books;
    public LibraryBookSystem(){
        books = new ArrayList<>();
    }
    public void addBook(String title, String author, double price, boolean availability){
        Book book = new Book(title, author, price, availability);
        books.add(book);
    }
    public static void main(String[] args) {
        // adding multiple books
        LibraryBookSystem lbs = new LibraryBookSystem();
        lbs.addBook("Java", "James Gosling", 100, true);
        lbs.addBook("Python", "Guido van Rossum", 120, true);
        lbs.addBook("C++", "Bjarne Stroustrup", 150, true);
        lbs.addBook("C", "Dennis Ritchie", 80, true);
        lbs.addBook("JavaScript", "Brendan Eich", 90, true);

        // borrowing a book
        lbs.books.get(0).borrowBook();

        // return book
        lbs.books.get(0).availability = true;

    }
}