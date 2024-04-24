//Create a program to convert Fahrenheit to Celsius
import java.util.*;

public class Temperature_Coverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenhite: ");
        float f = scanner.nextFloat();
        float c = ((f - 32) * 5)/9;
        System.out.println("Temp in Celsius: " + c);
        scanner.close();
    }

}
