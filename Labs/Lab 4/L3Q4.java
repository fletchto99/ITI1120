import java.util.Scanner;

public class L3Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int result = isDivisible(s.nextInt());
        System.out.println("n is divisible by "
                + (result > 0 ? (result == 23 ? "2 and 3" : (result == 2 ? "2"
                        : "3")) : "neither 2 or 3"));
        s.close();

    }

    private static int isDivisible(int n) {
        return n % 2 == 0 && n % 3 == 0 ? 23 : (n % 2 == 0 ? 2
                : (n % 3 == 0 ? 3 : -1));
    }

}
