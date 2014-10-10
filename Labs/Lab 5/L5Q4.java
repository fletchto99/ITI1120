import java.util.Scanner;


public class L5Q4 {

    public static void main(String[] args) {
        System.out.println("Enter an integer greater than 2 to find the value of n in the fibonacci series.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci [1] = 1;
        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(fibonacci[fibonacci.length-1]);
        s.close();
    }

}
