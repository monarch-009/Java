import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of number is " + gcd);

        scanner.close();
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int min = Min(num1, num2);
        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static int Min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
