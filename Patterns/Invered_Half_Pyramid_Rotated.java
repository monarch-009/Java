
//     *
//    **
//   ***
//  ****
// *****
import java.util.*;

public class Invered_Half_Pyramid_Rotated {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Pyramid: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { //outer Loop 
            for (int j = 1; j <= n - i; j++) { // inner loop -> Space Print
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // // inner loop -> Star Print 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
