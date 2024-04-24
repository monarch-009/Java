// Create a program that categorize a person into different age groups
// Child -> below 13 
// Teen -> below 20
// Adult -> below 60 
// Senior-> above 60
import java.util.*;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("Senior");
        } else if (age < 60) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen");
        } else {
            System.out.println("Child");
        }
        scanner.close();
    }

}
