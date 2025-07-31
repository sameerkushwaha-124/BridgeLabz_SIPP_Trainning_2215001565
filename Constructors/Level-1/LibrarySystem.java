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
    public void borrow(){
        if(availability){
            availability = false;
        }
    }
}
public class LibrarySystem {
    List<Book> books;
    public LibrarySystem(){
        books = new ArrayList<>();
    }
    public void addBook(String title, String author, double price, boolean availability){
        Book book = new Book(title, author, price, availability);
        books.add(book);
    }
    public static void main(String[] args) {
        LibrarySystem lbs = new LibrarySystem();
        lbs.addBook("Let Us C", "Yashwant Kanetkar", 490, true);
        lbs.addBook("Python de", "Guido van Rossum", 555, true);
        lbs.addBook("HTML", "Bjarne Stroustrup", 1500, true);
        lbs.addBook("C", "Dennis Ritchie", 280, true);
        lbs.addBook("JavaScript", "Brendan Eich", 590, true);

        lbs.books.get(0).borrow();
        lbs.books.get(0).availability = true;

    }
}