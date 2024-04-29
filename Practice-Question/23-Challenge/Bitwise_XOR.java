import java.util.*;

public class Bitwise_XOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int second = scanner.nextInt();
        System.out.println("Bitwise XOR of first and second number is " + (first ^ second));
        scanner.close();

    }

}
