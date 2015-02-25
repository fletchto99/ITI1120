import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 2

public class A2Q1 {

    private static boolean isTriangle(final int s1, final int s2, final int s3) {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }

    public static void main(final String[] args) {
        System.out.println("Please enter 3 non-negative numbers.");
        final Scanner s = new Scanner(System.in);
        final int s1 = s.nextInt();
        final int s2 = s.nextInt();
        final int s3 = s.nextInt();
        System.out
                .printf(A2Q1.isTriangle(s1, s2, s3) ? "The three sides(%d,%d,%d) form a triangle."
                        : "The three sides (%d,%d,%,d) do not form a triangle.",
                        s1, s2, s3);
        s.close();
    }

}
