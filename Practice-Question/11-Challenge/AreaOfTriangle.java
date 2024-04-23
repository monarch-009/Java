//Area of Traingle
import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the heigth : ");
        float h = scanner.nextFloat();
        System.out.print("Enter the breadth: ");
        float b = scanner.nextFloat();

        System.out.println("Area of Triangle: " + (h * b) / 2);

        scanner.close();
    }

}
