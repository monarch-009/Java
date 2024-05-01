
// Write a function that calculates the factorial of a given number.
import java.util.*;

public class Factorial {
    public static int Fact(int n) {
        int factorial = 1;
        if (n < 2) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Factorail : " + Fact(num));

        scanner.close();
    }

}
