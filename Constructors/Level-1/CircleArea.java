public class CircleArea {
    static double  pi;
    int radius;
    static { pi = 3.14; }
    public CircleArea(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        CircleArea c1 = new CircleArea(10);
        double area = c1.pi * c1.radius * c1.radius;
        System.out.println("Area of Circle is : " + area);
    }
}