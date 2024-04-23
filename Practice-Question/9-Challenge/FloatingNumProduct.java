
//Create a program to calculate product of two floating points number
import java.util.*;

public class FloatingNumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first float number as f1: ");
        float f1 = scanner.nextFloat();
        System.out.print("Enter second float number as f2: ");
        float f2 = scanner.nextFloat();

        System.out.println("Product of f1 * f2 : " + f1 * f2);

        scanner.close();
    }

}
