import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.println("Fibonacci Series...!");
        PrintFibonacci(num);
        scanner.close();
    }

    public static void PrintFibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0 ");
        if (num == 0)
            return;
        System.out.print("1 ");
        int num1 = 0;
        int num2 = 1;
        // System.out.print(num1 + " " + num2);
        while (num1 + num2 <= num) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }

    }

}
