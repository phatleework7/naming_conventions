package camelcase;

public class StudentDatabaseManager {

    // Field name in camelCase
    private int studentAge;
    private String studentName;

    // Constructor with CamelCase field
    public StudentDatabaseManager(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    // Method name in camelCase
    public void calculateTotalMarks() {
        // Variable name in camelCase
        int totalMarks = 0;
        // Simulate calculation
        totalMarks = studentAge * 2; // Just an example
        System.out.println("Total Marks: " + totalMarks);
    }

    // Getter and Setter methods in camelCase
    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int age) {
        this.studentAge = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public static void main(String[] args) {
        // Variable name in camelCase
        StudentDatabaseManager student = new StudentDatabaseManager("John Doe", 20);
        student.calculateTotalMarks();
    }

}

