import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 2

public class A2Q2 {

    static boolean isSafe(final int n) {
        return n < 89 && n % 9 != 0 && n % 10 != 9;
    }

    public static void main(final String[] args) {
        System.out.println("Please enter a number between 1 and 99");
        final Scanner s = new Scanner(System.in);
        System.out.println("The number entered is "
                + (A2Q2.isSafe(s.nextInt()) ? "safe." : "not safe."));
        s.close();
    }

}
