// Enter the length of butterfly: 10
// *                  *
// **                **
// ***              ***
// ****            ****
// *****          *****
// ******        ******
// *******      *******
// ********    ********
// *********  *********
// ********************
// ********************
// *********  *********
// ********    ********
// *******      *******
// ******        ******
// *****          *****
// ****            ****
// ***              ***
// **                **
// *                  *

import java.util.*;

public class Butterfly_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of butterfly: ");
        int n = sc.nextInt();

        // First half -> upper half
        for (int i = 1; i <= n; i++) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half -> lower half
        for (int i = n; i >= 1; i--) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
