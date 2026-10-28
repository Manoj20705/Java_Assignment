package Assignment3;

public class StudentRecord {

    int rollNo;
    String name;
    double marks;

    StudentRecord(int roll, String student, double score) {
        rollNo = roll;
        name = student;
        marks = score;
    }

    StudentRecord(StudentRecord s) {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord(101, "Arun", 85);
        StudentRecord s2 = new StudentRecord(s1);

        s2.marks = 95;

        System.out.println("Original Student Record:");
        s1.displayDetails();

        System.out.println("Copied Student Record:");
        s2.displayDetails();
    }
}