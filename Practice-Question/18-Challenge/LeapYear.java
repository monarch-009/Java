
//18.Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400).
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

}
