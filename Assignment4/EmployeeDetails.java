package Assignment4;

class EmployeeDetails {
    String employeeName;
    int employeeId;

    EmployeeDetails(String name, int id) {
        employeeName = name;
        employeeId = id;
    }

    void responsibility() {
        System.out.println("General employee responsibilities");
    }

    void display() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
        responsibility();
    }

    public static void main(String[] args) {
        Developer softwareDeveloper =
                new Developer("Ravi", 101);

        TeamManager projectManager =
                new TeamManager("Kumar", 102);

        softwareDeveloper.display();
        projectManager.display();
    }
}

class Developer extends EmployeeDetails {
    Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void responsibility() {
        System.out.println("Develops and tests software");
    }
}

class TeamManager extends EmployeeDetails {
    TeamManager(String name, int id) {
        super(name, id);
    }

    @Override
    void responsibility() {
        System.out.println("Manages the team and projects");
    }
}