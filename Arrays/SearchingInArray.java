import java.util.*;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elemnet in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number you want search: ");
        int search = scanner.nextInt();

        boolean isFound = isFound(arr, search);
        if (isFound) {
            System.out.println("Element is in array");
        } else {
            System.out.println("Elemnt is not in array");
        }

        scanner.close();
    }

    public static boolean isFound(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}
