package Assignment3;

public class Student {

    int id;
    String name;
    String course;

    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
    }
}