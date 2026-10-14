
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        if (l == b && l > 0)
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");
    }
}
