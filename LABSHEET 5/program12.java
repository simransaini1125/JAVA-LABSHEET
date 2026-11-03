
class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer is writing code.");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Manager is conducting a meeting.");
    }
}

class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Simran";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        System.out.println("Developer Details:");
        d.writeCode();

        System.out.println();

        System.out.println("Manager Details:");
        m.conductMeeting();
    }
}
