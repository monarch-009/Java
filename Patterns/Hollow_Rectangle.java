// Enter the number of rows: 6
// Enter the number of column: 6
// ******
// *    *
// *    *
// *    *
// *    *
// ******
import java.util.*;

public class Hollow_Rectangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of column: ");
        int c = s.nextInt();

        for (int i = 1; i <= r; i++) { // Outer Loop -> Rows
            for (int j = 1; j <= c; j++) { // Inner Loop -> Columns
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
