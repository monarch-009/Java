// Enter the length of rhombus: 6
//           * * * * * *
//         * * * * * *
//       * * * * * *
//     * * * * * *
//   * * * * * *
// * * * * * *

import java.util.*;

public class Solid_Rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rhombus: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }

}
