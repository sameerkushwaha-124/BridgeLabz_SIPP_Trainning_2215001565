// Create a Person class with a copy constructor that clones another person's attributes.

public class Person {
    String name;
    int age;
    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);

        Person p2 = new Person(p1);

        System.out.println("Person 2: " + p2.name + ", " + p2.age);
    }
    
}
