package Assignment4;

class Student {
    String studentName;
    int studentAge;

    Student(String name) {
        studentName = name;
        studentAge = 0;
    }

    Student(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    void display() {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Vishwa");
        Student secondStudent = new Student("kamalesh", 21);

        firstStudent.display();
        secondStudent.display();
    }
}