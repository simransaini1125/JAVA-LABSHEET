
import java.util.ArrayList;

class GenericArrayList
{
    static <T> void display(ArrayList<T> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Simran");

        System.out.println("Integer List:");
        display(numbers);

        System.out.println("String List:");
        display(names);
    }
}
