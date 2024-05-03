
//Create a program that computes the sum of the digits of an integer.
import java.util.*;;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int sum = 0;

        while (num != 0) {
            int n = num % 10;
            sum = sum + n;

            num /= 10;
        }
        System.out.println(sum);

        scanner.close();
    }

}
