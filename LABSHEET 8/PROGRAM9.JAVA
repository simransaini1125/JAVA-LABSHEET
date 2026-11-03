
import java.util.ArrayList;

class GenericList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++)
        {
            list.add(i * 10);
        }

        System.out.println("ArrayList Elements:");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
