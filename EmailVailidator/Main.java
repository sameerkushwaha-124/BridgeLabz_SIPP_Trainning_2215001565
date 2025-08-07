import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    // Custom unchecked exception
    static class InvalidEmailFormatException extends RuntimeException {
        public InvalidEmailFormatException(String message) {
            super(message);
        }
    }

    // Employee class
    static class Employee {
        String name;
        String email;

        public Employee(String name, String email) {
            if (!isValidEmail(email)) {
                throw new InvalidEmailFormatException("Invalid email: " + email);
            }
            this.name = name;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', email='" + email + "'}";
        }
    }

    // Email validation method
    public static boolean isValidEmail(String email) {
        String regex = "^[a-z0-9._]+@company\\.com$";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees
        addEmployee(employees, "Alice", "alice@company.com");       // Valid
        addEmployee(employees, "Bob", "bob_99@company.com");        // Valid
        addEmployee(employees, "Charlie", "charlie@other.com");     // Invalid
        addEmployee(employees, "David", "david.company.com");       // Invalid
        addEmployee(employees, "Eve", "eve.123@company.com");       // Valid

        // Search by domain
        System.out.println("\nEmployees with domain 'company.com':");
        for (Employee e : employees) {
            if (e.email.endsWith("@company.com")) {
                System.out.println(e);
            }
        }
    }

    // Add employee with exception handling
    public static void addEmployee(List<Employee> list, String name, String email) {
        try {
            Employee emp = new Employee(name, email);
            list.add(emp);
            System.out.println("Added: " + emp);
        } catch (InvalidEmailFormatException ex) {
            System.err.println("Failed to add " + name + ": " + ex.getMessage());
        }
    }
}
