package Assignment5;

class BaseEmployee {
    String empName;
    double empSalary;

    void display() {
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSalary);
    }
}

class Developer extends BaseEmployee {
    String language;

    void displayDeveloper() {
        display();
        System.out.println("Programming Language: " + language);
    }
}

class Tester extends BaseEmployee {
    String tool;

    void displayTester() {
        display();
        System.out.println("Testing Tool: " + tool);
    }
}

public class Employee {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.empName = "Arun";
        dev.empSalary = 40000;
        dev.language = "Java";

        Tester test = new Tester();
        test.empName = "Priya";
        test.empSalary = 35000;
        test.tool = "Selenium";

        System.out.println("Developer Details:");
        dev.displayDeveloper();

        System.out.println("\nTester Details:");
        test.displayTester();
    }
}