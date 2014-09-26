import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter pounts x y x1 y1");
        System.out.printf(
                "The distance between the points is: %.2f",
                computeDistance(s.nextDouble(), s.nextDouble(), s.nextDouble(),
                        s.nextDouble()));
        s.close();
    }

    static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}
