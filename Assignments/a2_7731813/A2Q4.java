import java.util.Scanner;

public class A2Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer to computer the series.");
        System.out.printf("The sum of the series is: %.3f",
                computeSeries(s.nextInt()));
        System.out
                .println("Enter an integer to computer the series recusivly.");
        System.out.printf("The sum of the series is: %.3f",
                computeRecursiveSeries(s.nextInt()));
        s.close();
    }

    static double computeSeries(int n) {
        double d = 1;
        for (int i = n; i > 1; --i) {
            d += 1 / Math.pow(i, 2);
        }
        return d;
    }

    static double computeRecursiveSeries(int n) {
        if (n <= 1) {
            return 1;
        }
        return (1 / Math.pow(n, 2)) + computeRecursiveSeries(n - 1);
    }

}