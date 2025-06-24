// Write a Circle class with a radius attribute. Use constructor chaining to initialize
//  radius with default and user-provided values.

public class Circle {
    static double  pi;
    int radius;
    static {
        pi = 3.14;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        double area = c1.pi * c1.radius * c1.radius;
        System.out.println("Area of Circle is : " + area);
    }
}
