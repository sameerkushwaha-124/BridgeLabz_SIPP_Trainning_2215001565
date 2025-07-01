// Problem 2: Online Course Management
// Design a Course class with:
// Instance Variables: courseName, duration, fee.
// Class Variable: instituteName (common for all courses).
// Methods:
// An instance method displayCourseDetails() to display the course details.
// A class method updateInstituteName() to modify the institute name for all courses.

public class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "BridgeLabz Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 299.99);
        course1.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");
        
        Course course2 = new Course("Python Programming", 10, 249.99);
        course2.displayCourseDetails();
    }
}