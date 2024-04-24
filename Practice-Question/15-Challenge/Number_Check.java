// Create a program that determines if a number is positive, negative, or zero.

import java.util.*;

public class Number_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Number is 0.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is positive.");
        }
        scanner.close();

    }

}
