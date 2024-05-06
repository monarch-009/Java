import java.util.*;;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse number  = " + reverse);
        scanner.close();
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        return rev;

    }

}
