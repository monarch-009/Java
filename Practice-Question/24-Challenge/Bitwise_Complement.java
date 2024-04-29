import java.util.*;

public class Bitwise_Complement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  Number: ");
        int first = scanner.nextInt();

        System.out.println("Bitwise Complement of first and second number is " + (~first));

        scanner.close();

    }

}
