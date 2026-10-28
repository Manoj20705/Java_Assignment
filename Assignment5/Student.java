package Assignment5;

class Person {
    String personName;
    int personAge;

    Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
}

class StudentDetails extends Person {
    int studentRoll;

    StudentDetails(String personName, int personAge, int studentRoll) {
        super(personName, personAge);
        this.studentRoll = studentRoll;
    }

    void display() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
        System.out.println("Roll Number: " + studentRoll);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDetails studentInfo =
                new StudentDetails("Arun", 21, 501);

        studentInfo.display();
    }
}