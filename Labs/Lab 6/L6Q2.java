import java.util.Arrays;
import java.util.Scanner;

public class L6Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] ranges = new double[10];
        for (int i = 0; i < ranges.length; i++) {
            System.out
                    .printf("What is the velocity of the throw for the angle %d degrees?%n",
                            i * 10);
            ranges[i] = computeRange(s.nextDouble(), i * 10);
        }
        System.out.println("The ranges are as follows: "
                + Arrays.toString(ranges));
        s.close();
    }

    static double computeRange(double velocity, double angle) {
        return 2 * ((Math.pow(velocity, 2) * Math.cos((Math.PI / 180) * angle) * Math
                .sin((Math.PI / 180) * angle)) / (9.8));
    }

}
