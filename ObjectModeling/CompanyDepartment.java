// Problem 3: Company and Departments (Composition)
// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
// Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.

import java.util.ArrayList;
import java.util.List;
public class CompanyDepartment {
    public static class Employee {
        private String name;
        private String position;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        public String toString() {
            return "Employee{name='" + name + "', position='" + position + "'}";
        }
    }
    

    public static class Department {
        private String departmentName;
        private List<Employee> employees;

        public Department(String departmentName) {
            this.departmentName = departmentName;
            this.employees = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        @Override
        public String toString() {
            return "Department{" +
                    "departmentName='" + departmentName + '\'' +
                    ", employees=" + employees +
                    '}';
        }
    }


    public static class Company {
        private String companyName;
        private List<Department> departments;

        public Company(String companyName) {
            this.companyName = companyName;
            this.departments = new ArrayList<>();
        }

        public void addDepartment(Department department) {
            departments.add(department);
        }

       
        public String toString() {
            return "Company{" +
                    "companyName='" + companyName + '\'' +
                    ", departments=" + departments +
                    '}';
        }
    }


    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        
        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Alice", "Manager"));
        
        Department it = new Department("IT");
        it.addEmployee(new Employee("Bob", "Developer"));
        
        company.addDepartment(hr);
        company.addDepartment(it);
        
        System.out.println(company);
    }
}