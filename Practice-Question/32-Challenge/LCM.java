import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        System.out.println("LCM of two number is : " + lcm(first, second));

        scanner.close();
    }

    public static int lcm(int first, int second) {
        for (int i = 1; i <= second; i++) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
        }
        return 0;
    }

}
