
//Create a program that determines the greatest of the three numbers.
import java.util.*;

public class Greatest_of_Three_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First Number is greatest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number is greatest.");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All are equal.");
        } else {
            System.out.println("Third number is greatest.");
        }
        scanner.close();

    }

}
