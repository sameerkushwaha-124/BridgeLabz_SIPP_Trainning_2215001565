// Problem 1: Product Inventory
// Create a Product class with:
// Instance Variables: productName, price.
// Class Variable: totalProducts (shared among all products).
// Methods:
// An instance method displayProductDetails() to display the details of a product.
// A class method displayTotalProducts() to show the total number of products created.

public class Product{
    int productName;
    int price;
    static int totalProducts;

    public Product(int productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public String displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        return "Product Name: " + productName + ", Price: " + price;
    }
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
    
    public static void main(String args[]){
        Product product1 = new Product(101, 500);
        product1.displayProductDetails();
        totalProducts++;
        
        Product product2 = new Product(102, 1500);
        product2.displayProductDetails();
        totalProducts++;
        
        Product.displayTotalProducts();
    }
}