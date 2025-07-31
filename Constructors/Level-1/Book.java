public class Book{
    String title;
    String author;
    double price;
    Book(){
        title = "Let Us C";
        author = "Yashwant Kanetkar";
        price = 500;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book("Let Us C", "Yashwant Kanetkar", 500);
        System.out.println(book1.title + " " + book1.author + " " + book1.price);
        System.out.println(book2.title + " " + book2.author + " " + book2.price);
    }
}