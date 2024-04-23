
// Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).
import java.util.*;

public class ArthmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second number b: ");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        scanner.close();
    }

}
