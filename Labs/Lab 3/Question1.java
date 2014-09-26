import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("The average (to 3 decimal places) is: %.3f%n",
                problemSolving(s.nextDouble(), s.nextDouble(), s.nextDouble()));
        s.close();
    }

    static double problemSolving(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
