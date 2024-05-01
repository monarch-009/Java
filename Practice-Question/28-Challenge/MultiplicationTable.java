// Develop a program that prints the multiplication table for a given number.
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = i * n;
            System.out.println(n + " * " + i + " = " + mul);
        }

        scanner.close();
    }
}
