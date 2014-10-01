import java.util.Scanner;


public class L4Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("The sum of squares is %d", sumOfSquares(s.nextInt()));
        s.close();
    }

    private static int sumOfSquares(int n) {
        if (n ==1 ){
            return 1;
        }
        return (int) (sumOfSquares(n-1) + Math.pow(n,2));
    }

}
