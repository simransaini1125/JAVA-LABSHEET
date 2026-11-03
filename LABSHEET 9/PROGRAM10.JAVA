import java.util.ArrayList;
import java.util.HashSet;

class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        int numbers[] = {10, 20, 10, 30, 20, 40};

        for (int n : numbers) {
            list.add(n);
            set.add(n);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}