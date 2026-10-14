
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i, flag = 0;

        if (n < 2)
            flag = 1;
        else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
