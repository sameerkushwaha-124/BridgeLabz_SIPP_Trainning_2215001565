import java.util.*;

interface Graded {
    void assignGrade(Student student, String course, boolean passed);
}

// Student Class
class Student {
    public String name;
    public int rollNo;
    private double cgpa = 0.0;
    private Map<String, Boolean> enrolledCourses;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.enrolledCourses = new HashMap<>();
    }

    public void enroll(String courseName) {
        enrolledCourses.put(courseName, false); // Initially not graded
        System.out.println(name + " enrolled in " + courseName);
    }

    public void unenroll(String courseName) {
        if (enrolledCourses.containsKey(courseName)) {
            enrolledCourses.remove(courseName);
            System.out.println(name + " unenrolled from " + courseName);
        } else {
            System.out.println("Not enrolled in course: " + courseName);
        }
    }

    public void receiveGrade(String course, boolean passed) {
        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, passed);
            updateCGPA();
        }
    }

    private void updateCGPA() {
        double total = 0.0;
        for (boolean passed : enrolledCourses.values()) {
            total += passed ? 1.5 : 0.0; // GPA rule
        }
        cgpa = enrolledCourses.isEmpty() ? 0.0 : total / enrolledCourses.size();
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transcript for ").append(name).append(" (Roll No: ").append(rollNo).append("):\n");
        for (Map.Entry<String, Boolean> entry : enrolledCourses.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue() ? "Passed" : "Failed").append("\n");
        }
        sb.append("Current GPA: ").append(String.format("%.2f", cgpa));
        return sb.toString();
    }
}

// Course class
class Course {
    private List<String> courseList;

    public Course() {
        courseList = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        courseList.add(courseName);
    }

    public void removeCourse(String courseName) {
        courseList.remove(courseName);
    }

    public boolean isAvailable(String courseName) {
        return courseList.contains(courseName);
    }

    public List<String> getAllCourses() {
        return courseList;
    }
}

// Faculty class
class Faculty implements Graded {
    public String facultyName;

    public Faculty(String name) {
        this.facultyName = name;
    }

    @Override
    public void assignGrade(Student student, String course, boolean passed) {
        System.out.println(facultyName + " assigned grade to " + student.name + " for course " + course);
        student.receiveGrade(course, passed);
    }
}

// Enrollment utility class
class Enrollment {
    public static void enrollStudentInCourse(Student student, Course courseList, String courseName) {
        if (courseList.isAvailable(courseName)) {
            student.enroll(courseName);
        } else {
            System.out.println("Course not available: " + courseName);
        }
    }
}

// Undergraduate class
class Undergraduate extends Student {
    public Undergraduate(String name, int rollNo) {
        super(name, rollNo);
    }
}

// Postgraduate class
class Postgraduate extends Student {
    public Postgraduate(String name, int rollNo) {
        super(name, rollNo);
    }
}

// Main Class
public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        // Courses
        Course courseCatalog = new Course();
        courseCatalog.addCourse("Data Structures");
        courseCatalog.addCourse("Operating Systems");

        // Students
        Undergraduate student1 = new Undergraduate("Alice", 101);
        Postgraduate student2 = new Postgraduate("Bob", 202);

        // Enrollment
        Enrollment.enrollStudentInCourse(student1, courseCatalog, "Data Structures");
        Enrollment.enrollStudentInCourse(student2, courseCatalog, "Operating Systems");

        // Faculty
        Faculty prof = new Faculty("Dr. Smith");

        // Grading
        prof.assignGrade(student1, "Data Structures", true);
        prof.assignGrade(student2, "Operating Systems", false);

        // Transcript
        System.out.println("\n" + student1.getTranscript());
        System.out.println("\n" + student2.getTranscript());
    }
}
