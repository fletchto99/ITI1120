import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 2 integers");
        System.out
                .println(isDivisible(s.nextInt(), s.nextInt()) ? "n is divisible by m"
                        : "n is not divisible by m");
        s.close();

    }

    private static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

}
