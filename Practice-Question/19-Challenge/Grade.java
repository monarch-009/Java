
// Create a program that calculates grades based on marks
// A -> above 90% 
// B -> above 75%
// C -> above 60% 
// D -> above 30%
// F -> below 30%
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Percent: ");
        float num = scanner.nextInt();
        if (num >= 90) {
            System.out.println("A - Grade");
        } else if (num >= 75) {
            System.out.println("B - Grade");
        } else if (num >= 60) {
            System.out.println("C - Grade");
        } else if (num >= 30) {
            System.out.println("D - Grade");
        } else if (num < 30) {
            System.out.println("E - Grade");
        }
        scanner.close();

    }

}
