
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
        } else {
            this.salary = salary;

            if (salary > 1000000) {
                System.out.println("Salary is greater than 1000000.");
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");
        e.setSalary(1200000);

        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Employee Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getSalary());
    }
}
