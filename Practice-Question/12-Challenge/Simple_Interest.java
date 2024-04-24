
//Create a program to calculate simple interest.
import java.util.*;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int p = scanner.nextInt();
        System.out.print("Enter the time in year: ");
        int t = scanner.nextInt();
        System.out.print("Enter the rate: ");
        float r = scanner.nextFloat();

        float i = (p * r * t) / 100;
        System.out.println("Simple Interest: " + i);

        scanner.close();
    }

}
