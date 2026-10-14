class Employee {
    String name;
    double salary;

    static String organization = "ABC Company";

    void compareSalary(Employee e) {
        System.out.println("Organization: " + organization);

        if (salary > e.salary) {
            System.out.println(name + " has higher salary");
        } else if (salary < e.salary) {
            System.out.println(e.name + " has higher salary");
        } else {
            System.out.println("Both have equal salary");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e1.salary = 30000;

        e2.name = "Aman";
        e2.salary = 25000;

        e1.compareSalary(e2);
    }
}