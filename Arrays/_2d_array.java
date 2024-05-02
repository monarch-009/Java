import java.util.*;

public class _2d_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of row: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the size of colums: ");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];

        // Input
        System.out.println("Enter the element in 2d array: ");
        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < cols; j++) { // colums
                arr[i][j] = scanner.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < cols; j++) { // colums
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
