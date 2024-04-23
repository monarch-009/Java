
// Create a Program to calculate the  Perimeter of a rectangle
import java.util.*;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = scanner.nextInt();
        System.out.print("Enter the Breadth: ");
        int bre = scanner.nextInt();

        System.out.println("Perimeter of Rectangle is " + 2*(len+bre));
        scanner.close();
    }

}
