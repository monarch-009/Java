// Enter the height of the diamond: 4
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
import java.util.*;

public class Diamond_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the diamond: ");
        int n = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = n; i>= 1; i--) {
            // Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
