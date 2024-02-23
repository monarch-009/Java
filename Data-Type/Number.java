public class Number {
    public static void main(String[] args) {
        // Interger Type
        byte numb = 100;
        short nums = 5000;
        int numi = 100000;
        long numl = 100000L;

        // Float Type
        float numf = 9.9f;
        double numd = 99.99d;

        System.out.println("byte: " + numb);
        System.out.println("short: " + nums);
        System.out.println("int: " + numi);
        System.out.println("long: " + numl);
        System.out.println("float: " + numf);
        System.out.println("double: " + numd);

        // Scientific Numbers
        // A floating point number can also be a scientific number with an "e" to
        // indicate the power of 10:

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}