
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        if (n >= 100 && n <= 999 && sum == n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
