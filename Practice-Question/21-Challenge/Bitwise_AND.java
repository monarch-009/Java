
// Create a program that shows bitwise AND of two numbers.
import java.util.*;

public class Bitwise_AND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int second = scanner.nextInt();

        System.out.println("Bitwise AND of first & second is " + (first & second));

        scanner.close();
    }

}
