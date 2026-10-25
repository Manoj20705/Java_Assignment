package Assignment1;

class InstanceVariable {
    String name;
    int rollNo;

    void register(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println(name + " " + rollNo);
    }

    public static void main(String[] args) {
    	InstanceVariable s1 = new InstanceVariable();
    	InstanceVariable s2 = new InstanceVariable();
    	InstanceVariable s3 = new InstanceVariable();

        s1.register("Manoj", 101);
        s2.register("Nandha", 102);
        s3.register("Siva", 103);

        s1.display();
        s2.display();
        s3.display();
    }
}
