public class basic_of_array {
    public static void main(String[] args) {
        // Array Declaration
        int[] arr = new int[5];
        
        // Array Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing Array Elements
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        // Array Length
        System.out.println(arr.length);

        // Traversing Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
