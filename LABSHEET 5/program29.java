
class Employee
{
    String name;
    double salary;

    static String organization = "ABC Company";

    Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    void compareSalary(Employee e)
    {
        double salary1 = salary;
        double salary2 = e.salary;

        if(salary1 > salary2)
        {
            System.out.println(name + " has higher salary");
        }
        else if(salary2 > salary1)
        {
            System.out.println(e.name + " has higher salary");
        }
        else
        {
            System.out.println("Both have equal salary");
        }
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Aman", 25000);

        System.out.println("Organization: " + organization);

        e1.compareSalary(e2);
    }
}
