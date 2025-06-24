// Create a Book class with attributes title, author, and price. 
// Provide both default and parameterized constructors.

public class Book{
    String title;
    String author;
    double price;
    Book(){
        title = "Harry Potter";
        author = "J.K. Rowling";
        price = 1000;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args){
        Book book1 = new Book();

        Book book2 = new Book("Harry Potter", "J.K. Rowling", 1000);

        System.out.println(book1.title + " " + book1.author + " " + book1.price);
        System.out.println(book2.title + " " + book2.author + " " + book2.price);


    }
}