import java.util.Scanner;

public class L4Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long start = System.currentTimeMillis();
        System.out.printf("The sum of squares is %d%n",
                sumOfSquares(s.nextInt()));
        long execute = System.currentTimeMillis() - start;
        System.out.println("Recursive: " + execute);

        start = System.currentTimeMillis();
        int sumOfSquares = 0;
        int n = s.nextInt();
        for (int i = n; i > 0; --i) {
            sumOfSquares += Math.pow(i, 2);
        }
        execute = System.currentTimeMillis() - start;
        System.out.println(sumOfSquares);
        System.out.println("Iter: " + execute);
        s.close();
    }

    private static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) (Math.pow(n, 2) + sumOfSquares(n - 1));
    }

}
