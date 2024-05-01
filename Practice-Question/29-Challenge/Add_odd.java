// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class Add_odd {

    public static void add_Odds(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Add of Odds is " + sum);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        add_Odds(n);
        sc.close();

    }

}
