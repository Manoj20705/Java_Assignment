
package Assignment2;

public class EmployeeSalary {

    double calculateSalary(double basic, double allowance) {
        return basic + allowance;
    }

    double calculateNetSalary(double gross, double deduction) {
        return gross - deduction;
    }

    void displayDetails(double gross, double net) {
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }

    public static void main(String[] args) {
        EmployeeSalary obj = new EmployeeSalary();

        double grossPay = obj.calculateSalary(25000, 5000);
        double netPay = obj.calculateNetSalary(grossPay, 2000);

        obj.displayDetails(grossPay, netPay);
    }
}
