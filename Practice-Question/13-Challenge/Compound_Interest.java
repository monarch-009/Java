import java.util.*;;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double p = scanner.nextInt();
        System.out.print("Enter the time in year: ");
        double t = scanner.nextInt();
        System.out.print("Enter the rate: ");
        double r = scanner.nextFloat();

        double ci = p * Math.pow((1 + r / 100), t);
        System.out.println("Simple Interest: " + ci);
        scanner.close();
    }

}
