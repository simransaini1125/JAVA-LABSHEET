
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter operator (&, |, !): ");
        char op = sc.next().charAt(0);

        if (op == '&')
            System.out.println("Result = " + (a != 0 && b != 0));
        else if (op == '|')
            System.out.println("Result = " + (a != 0 || b != 0));
        else if (op == '!')
            System.out.println("Result = " + (a == 0));
        else
            System.out.println("Invalid operator");
    }
}
