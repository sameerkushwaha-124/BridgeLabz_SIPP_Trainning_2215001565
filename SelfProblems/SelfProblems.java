// Problem 1: School and Students with Courses (Association and Aggregation)
// Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
// Tasks:
// Define School, Student, and Course classes.
// Model an association between Student and Course to show that students can enroll in multiple courses.
// Model an aggregation relationship between School and Student.
// Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
// Goal: Practice association by modeling many-to-many relationships between students and courses.
import java.util.ArrayList;
import java.util.List;

public class SelfProblems {
   

    static class School {
        private String name;
        private List<Student> students;

        public School(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public String getName() {
            return name;
        }
    }
    

    static class Course {
        private String name;
        private List<Student> enrolledStudents;

        public Course(String name) {
            this.name = name;
            this.enrolledStudents = new ArrayList<>();
        }

        public void enrollStudent(Student student) {
            enrolledStudents.add(student);
        }

        public String getName() {
            return name;
        }

        public List<Student> getEnrolledStudents() {
            return enrolledStudents;
        }
    }   

    static class Student {
        private String name;
        private List<Course> enrolledCourses;

        public Student(String name) {
            this.name = name;
            this.enrolledCourses = new ArrayList<>();
        }

        public void enrollInCourse(Course course) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }

        public String getName() {
            return name;
        }

        public List<Course> getEnrolledCourses() {
            return enrolledCourses;
        }
    }
 

    public static void main(String[] args) {
        
        School school = new School("BridgeLabz Academy");

       
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

       
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);
        bob.enrollInCourse(history);

        
        school.addStudent(alice);
        school.addStudent(bob);

        
        System.out.println(alice.getName() + " is enrolled in: " + alice.getEnrolledCourses());
        System.out.println(bob.getName() + " is enrolled in: " + bob.getEnrolledCourses());

        
        System.out.println(math.getName() + " has enrolled students: " + math.getEnrolledStudents());
    }
}