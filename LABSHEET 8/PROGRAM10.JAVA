
import java.util.ArrayList;

class StringList
{
    public static void main(String args[])
    {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Priya");
        names.add("Simran");
        names.add("Neha");

        System.out.println("Names: " + names);

        System.out.println("First Name: " + names.get(0));

        names.set(1, "Rohit");
        System.out.println("After Set: " + names);

        names.remove(2);
        System.out.println("After Remove: " + names);

        System.out.println("Total Names: " + names.size());
    }
}
