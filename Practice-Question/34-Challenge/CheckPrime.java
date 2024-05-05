import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
