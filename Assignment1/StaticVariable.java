package Assignment1;

class StaticVariable {
    static int count = 0;

    void register() {
        count++;
        System.out.println("Employee Registered");
    }

    public static void main(String[] args) {
    	StaticVariable e1 = new StaticVariable();
    	StaticVariable e2 = new StaticVariable();
    	StaticVariable e3 = new StaticVariable();

        e1.register();
        e2.register();
        e3.register();

        System.out.println("Total Employees: " + count);
    }
}