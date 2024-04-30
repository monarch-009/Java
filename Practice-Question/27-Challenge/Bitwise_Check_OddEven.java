
// Write a program to check if a given number is even or odd using bitwise operators.
import java.util.*;

public class Bitwise_Check_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Number is odd.");
        } else {
            System.out.println("Number is even.");
        }

        scanner.close();
    }
}
