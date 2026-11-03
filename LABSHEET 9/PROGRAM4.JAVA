import java.util.HashSet;

class Q4 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<String>();

        departments.add("CSE");
        departments.add("IT");
        departments.add("ECE");
        departments.add("CSE");
        departments.add("Mechanical");
        departments.add("IT");

        System.out.println("Unique Departments: " + departments);
    }
}