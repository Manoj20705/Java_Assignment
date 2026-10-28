package Assignment3;

public class Employee {

    int empId;
    String empName;
    double monthlySalary;

    Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        monthlySalary = salary;
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Arun", 25000);
        Employee e2 = new Employee(102, "Divya", 35000);
        Employee e3 = new Employee(103, "Kumar", 40000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}