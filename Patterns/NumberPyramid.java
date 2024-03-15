//  Enter the height of pyramid: 5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


import java.util.*;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int n = sc.nextInt();

        for(int i = 1;i<= n;i++){
            //Space
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Space
            for(int k =1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
