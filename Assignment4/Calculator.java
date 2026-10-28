package Assignment4;

class Calculator {
    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    double add(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Integer Sum: " +
                calculator.add(10, 20));

        System.out.println("Decimal Sum: " +
                calculator.add(2.5, 3.5));

        Employee worker = new Manager();
        System.out.println("Bonus: " + worker.calculateBonus());
    }
}

class Employee {
    double calculateBonus() {
        return 5000;
    }
}

class Manager extends Employee {
    @Override
    double calculateBonus() {
        return 10000;
    }
}