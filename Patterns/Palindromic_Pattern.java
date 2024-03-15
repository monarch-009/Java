//         1
//        212
//       32123
//      4321234
//     543212345
//    65432123456
//   7654321234567
//  876543212345678
// 98765432123456789
// ------------------

import java.util.*;

public class Palindromic_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the palindrom: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // First half number
            for(int k = i ; k>=1 ; k--){
                System.out.print(k);
            };
            // Second half number
            for(int l = 2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
