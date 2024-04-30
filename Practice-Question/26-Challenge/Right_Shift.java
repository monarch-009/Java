// Create a program that shows use of right shift operator

import java.util.*;

public class Right_Shift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int num = scanner.nextInt();
      
        System.out.println("Left Shift of first and second is " + (num >> 2));

        scanner.close();
    }

}
