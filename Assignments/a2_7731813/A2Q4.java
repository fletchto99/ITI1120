import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 2

public class A2Q4 {

    static double computeSeries(final int n) {
        if (n <= 1) {
            return 1;
        }
        return (1 / Math.pow(n, 2)) + A2Q4.computeSeries(n - 1);
    }

    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer to computer the series.");
        System.out.printf("The sum of the series is: %.3f",
                A2Q4.computeSeries(s.nextInt()));
        s.close();
    }

}
