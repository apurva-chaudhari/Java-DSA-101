import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println(false);
            sc.close();
            return;
        }

        int temp = x;
        int rev = 0;

        while (temp != 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }

        System.out.println(x == rev);
        sc.close();
    }
}