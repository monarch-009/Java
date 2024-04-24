import java.util.*;;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int p = scanner.nextInt();
        System.out.print("Enter the time in year: ");
        int t = scanner.nextInt();
        System.out.print("Enter the rate: ");
        float r = scanner.nextFloat();

        float ci = p * (1 + (r / 100)) * t;
        System.out.println("Simple Interest: " + ci);
        scanner.close();
    }

}
