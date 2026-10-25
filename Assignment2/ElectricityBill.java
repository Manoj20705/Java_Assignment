package Assignment2;

public class ElectricityBill {

    double calculateBill(int units) {
        if (units <= 100)
            return units * 2;
        else if (units <= 200)
            return 200 + (units - 100) * 3;
        else
            return 500 + (units - 200) * 5;
    }

    double addFixedCharge(double energyCost) {
        return energyCost + 50;
    }

    void displayBill(double energyCost, double finalAmount) {
        System.out.println("Energy Charge: " + energyCost);
        System.out.println("Fixed Charge: 50.0");
        System.out.println("Final Bill: " + finalAmount);
    }

    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill();

        double energyCost = obj.calculateBill(250);
        double payableBill = obj.addFixedCharge(energyCost);

        obj.displayBill(energyCost, payableBill);
    }
}
