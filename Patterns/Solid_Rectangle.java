// Enter the number of column: 6
// Enter the number of rows: 7
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
import java.util.*;

public class Solid_Rectangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of column: ");
        int c = s.nextInt();
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();

        for (int i = 0; i < r; i++) { // Outer Loop 
            for (int j = 0; j < c; j++) { // Inner Loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
