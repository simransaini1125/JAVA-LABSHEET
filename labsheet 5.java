
class Employee {
    private String name;
    private int employeeId;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    public void conductResearch() {
        System.out.println("Developer is conducting research.");
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Simran");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
